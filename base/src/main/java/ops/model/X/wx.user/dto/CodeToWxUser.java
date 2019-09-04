package ops.model.X.wx.user.dto;

import ops.model.X.wx.user.entity.WxUser;

public class CodeToWxUser {

    private String appId;

    private String secret;


    private String code;

    private String sessionKey;

    private WxUser wxUser;

    public CodeToWxUser(String appId, String secret, String code) {
        this.appId = appId;
        this.secret = secret;
        this.code = code;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public WxUser getWxUser() {
        return wxUser;
    }

    public void setWxUser(WxUser wxUser) {
        this.wxUser = wxUser;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}
