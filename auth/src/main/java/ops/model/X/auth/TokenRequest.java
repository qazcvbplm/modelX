package ops.model.X.auth;

import java.util.Date;

public class TokenRequest {

    private String userId;

    private String secret;

    private Object extra;

    private Date outTime;

    private Integer OutTimeCount;

    private TimeUnit timeUnit;

    public TokenRequest(String userId, String secret, Object extra, Integer outTimeCount, TimeUnit timeUnit) {
        this.userId = userId;
        this.secret = secret;
        this.extra = extra;
        OutTimeCount = outTimeCount;
        this.timeUnit = timeUnit;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Date getOutTime() {
        if (timeUnit == TimeUnit.SECONDS) {
            return new Date(System.currentTimeMillis() + this.getOutTimeCount() * 1000);
        }
        if (timeUnit == TimeUnit.MINUTE) {
            return new Date(System.currentTimeMillis() + this.getOutTimeCount() * 1000 * 60);
        }
        if (timeUnit == TimeUnit.HOUR) {
            return new Date(System.currentTimeMillis() + this.getOutTimeCount() * 1000 * 60 * 60);
        }
        if (timeUnit == TimeUnit.DAY) {
            return new Date(System.currentTimeMillis() + this.getOutTimeCount() * 1000 * 60 * 60 * 24);
        }
        return null;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Integer getOutTimeCount() {
        return OutTimeCount;
    }

    public void setOutTimeCount(Integer outTimeCount) {
        OutTimeCount = outTimeCount;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }
}
