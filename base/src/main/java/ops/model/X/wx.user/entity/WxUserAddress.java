package ops.model.X.wx.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wx_user_address", indexes = {@Index(name = "user_index", columnList = "wx_user_id")})
public class WxUserAddress implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wx_user_id", nullable = false)
    private Long wxUserId;

    /**
     * 省
     */
    @Column(name = "province", nullable = true, length = 40)
    private String province;

    /**
     * 城市
     */
    @Column(name = "city", nullable = true, length = 40)
    private String city;

    /**
     * 区
     */
    @Column(name = "area", nullable = true, length = 40)
    private String area;

    /**
     * 手机号码
     */
    @Column(name = "phone", nullable = false, length = 11)
    private String phone;

    /**
     * 性别
     */
    @Column(name = "gender", nullable = true, length = 4)
    private String gender;

    @Column(name = "longitude", nullable = false)
    private Double longitude;


    @Column(name = "latitude", nullable = false)
    private Double latitude;
    /**
     * 详细地址
     */
    @Column(name = "address", nullable = false, length = 4)
    private String address;


    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @TableLogic
    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer deleted;

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public WxUserAddress(Long wxUserId, String province, String city, String area, String phone, String gender, Double longitude, Double latitude, String address) {
        this.wxUserId = wxUserId;
        this.province = province;
        this.city = city;
        this.area = area;
        this.phone = phone;
        this.gender = gender;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(Long wxUserId) {
        this.wxUserId = wxUserId;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
