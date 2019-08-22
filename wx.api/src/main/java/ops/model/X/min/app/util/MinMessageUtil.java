package ops.model.X.min.app.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import ops.model.X.min.app.dto.MinMessageDTO;
import wx.pay.HttpRequest;
import wx.pay.PayUtil;


public class MinMessageUtil {
    private static String openidurl = "https://api.weixin.qq.com/sns/jscode2session?appid=";
    private static String tokenurl = "https://api.weixin.qq.com/cgi-bin/token";  //获取token的api
    private static String codeurl = "https://api.weixin.qq.com/wxa/getwxacode?access_token=";                      //获取小程序二维码api
    private static String msurl = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send?access_token=";
    private static String query = "https://api.mch.weixin.qq.com/pay/orderquery";//查询对账单
    private static String token = null;
    private static long tokenTime = 0;
    private static final long tokenTimeRefreshTime = 7200 * 1000;


    /**
     * 获取access_token
     *
     * @param appId
     * @param secret
     * @return
     */
    public static String getAccessToken(String appId, String secret) {
        if (token != null || ((System.currentTimeMillis() - tokenTime) >= tokenTimeRefreshTime)) {
            String rs = HttpRequest.sendGet(tokenurl + "&appid=" + appId + "&secret=" + secret, "");
            JSONObject json = JSON.parseObject(rs, JSONObject.class);
            return json.getString("access_token");
        } else {
            return token;
        }
    }


    /**
     * 发送小程序服务通知模板
     * touser 用户openid
     * template_id 模板id
     * form_id  表单id  或者支付id
     * keyword 关键字 1,2,3,4,5,6,7.。。。
     */
    public static void snedM(MinMessageDTO minMessageDTO) {
        //发送模板消息
        String access_token = getAccessToken(minMessageDTO.getAppId(), minMessageDTO.getSecret());
        String rs = PayUtil.httpRequest(msurl + access_token, "POST", JSON.toJSONString(minMessageDTO));
    }
}
