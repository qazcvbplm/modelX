package ops.model.X.wx.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.wx.user.dao.WxUserDao;
import ops.model.X.wx.user.dto.CodeToWxUser;
import ops.model.X.wx.user.entity.WxUser;
import ops.model.X.wx.user.service.WxUserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class WxUserServiceImpl extends OpsServiceImpl<WxUserDao, WxUser> implements WxUserService {

    private static String openIdUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=";

    @Resource
    private WxUserDao wxUserDao;
    @Resource
    private RestTemplate restTemplate;

    public CodeToWxUser wxCodeToWxUser(CodeToWxUser codeToWxUser) {
        StringBuffer sb = new StringBuffer();
        String newUrl = sb.append(openIdUrl)
                .append(codeToWxUser.getAppId())
                .append("&secret=")
                .append(codeToWxUser.getSecret())
                .append("&js_code=")
                .append(codeToWxUser.getCode())
                .append("&grant_type=authorization_code").toString();
        String response = restTemplate.getForEntity(newUrl, String.class).getBody();
        JSONObject wxRes = JSON.parseObject(response, JSONObject.class);
        if (wxRes.get("errcode") != null) {
            throw new RuntimeException(wxRes.getString("errmsg"));
        }
        String openId = wxRes.getString("openid");
        String unionId = wxRes.getString("unionid");
        String sessionKey = wxRes.getString("session_key");
        codeToWxUser.setSessionKey(sessionKey);
        WxUser wxUser = findByOpenId(openId);
        if (wxUser == null) {
            wxUser = new WxUser();
            wxUser.setOpenId(openId);
            wxUser.setUnionId(unionId);
            this.save(wxUser);
        } else {
            if (wxUser.getUnionId() == null && unionId != null) {
                wxUser.setUnionId(unionId);
                updateById(wxUser);
            }
        }
        codeToWxUser.setWxUser(wxUser);
        return codeToWxUser;
    }

    public WxUser findByOpenId(String openId) {
        if (openId == null) {
            return null;
        }
        return this.getOne(new QueryWrapper<WxUser>().lambda().eq(WxUser::getOpenId, openId));
    }
}
