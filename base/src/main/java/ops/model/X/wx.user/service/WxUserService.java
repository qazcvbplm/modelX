package ops.model.X.wx.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ops.model.X.wx.user.dto.CodeToWxUser;
import ops.model.X.wx.user.entity.WxUser;

public interface WxUserService extends IService<WxUser> {


    /**
     * 用微信小程序获得的code来获得用户信息
     * 当用户不存在时新增一条记录
     * 当用户存在时返回用户信息
     *
     * @param codeToWxUser 微信获取的code
     * @return
     */
    CodeToWxUser wxCodeToWxUser(CodeToWxUser codeToWxUser);

    /**
     * 按照微信唯一表示查询用户
     *
     * @return
     */
    WxUser findByOpenId(String openId);

}
