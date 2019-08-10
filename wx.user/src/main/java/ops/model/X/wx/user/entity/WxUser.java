package ops.model.X.wx.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * wx_user
 *
 * @author
 */
@Entity
@Table(name = "wx_user", indexes = {@Index(name = "user_index", columnList = "open_id")})
public class WxUser implements Serializable {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 微信用户唯一标识
     */
    @Column(name = "open_id", nullable = false, length = 50)
    private String openId;


    /**
     * 微信昵称
     */
    @Column(name = "nick_name", nullable = true, length = 50)
    private String nickName;

    /**
     * 微信头像
     */
    @Column(name = "avatar_url", nullable = true, length = 50)
    private String avatarUrl;

    /**
     * 性别
     */
    @Column(name = "gender", nullable = true, length = 4)
    private String gender;

    /**
     * 省
     */
    @Column(name = "province", nullable = true, length = 20)
    private String province;

    /**
     * 城市
     */
    @Column(name = "city", nullable = true, length = 4)
    private String city;

    /**
     * 手机号码
     */
    @Column(name = "phone", nullable = true, length = 4)
    private String phone;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public WxUser(String openId, String nickName, String avatarUrl, String gender, String province, String city, String phone, Date createTime) {
        this.openId = openId;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.province = province;
        this.city = city;
        this.phone = phone;
        this.createTime = createTime;
    }

    public WxUser() {
        super();
    }

    private static final long serialVersionUID = 1L;


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}