package ops.model.X.min.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "min_app")
public class MinApp implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "app_id", nullable = false, length = 18)
    private String appId;

    @Column(name = "secret", nullable = false, length = 32)
    private String secret;

    @Column(name = "wx_pay_key", nullable = false, length = 32)
    private String wxPayKey;

    @Column(name = "mch_id", nullable = false, length = 20)
    private String mchId;

    @Column(name = "cert_path", nullable = false, length = 200)
    private String certPath;

    @TableLogic
    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer deleted;

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public void beAdd() {

    }

    @Override
    public void beUpdate() {

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

    public String getWxPayKey() {
        return wxPayKey;
    }

    public void setWxPayKey(String wxPayKey) {
        this.wxPayKey = wxPayKey;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getCertPath() {
        return certPath;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }
}
