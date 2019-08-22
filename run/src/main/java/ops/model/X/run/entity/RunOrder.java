package ops.model.X.run.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "run_order", uniqueConstraints = {@UniqueConstraint(columnNames = "order_id")},
        indexes = {@Index(columnList = "user_id,sender_id")})
public class RunOrder implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "area_id", nullable = false)
    private Long areaId;

    @Column(name = "order_id", nullable = false, length = 50)
    private String orderId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false,length = 40)
    private String userName;

    @Column(name = "user_phone", nullable = false,length = 11)
    private String userPhone;

    @Column(name = "user_image", nullable = false,length = 100)
    private String userImage;

    @Column(name = "user_address", nullable = false,length = 200)
    private String userAddress;

    @Column(name = "sender_id", nullable = true)
    private Long senderId;


    @Column(name = "sender_name", nullable = true,length = 40)
    private String senderName;

    @Column(name = "sender_phone", nullable = true,length = 11)
    private String senderPhone;

    @Column(name = "sender_image", nullable = true,length = 100)
    private String senderImage;


    @Column(name = "distance", nullable = false)
    private Double distance;

    @Column(name = "source_longitude", nullable = false)
    private Double sourceLongitude;


    @Column(name = "source_latitude", nullable = false)
    private Double sourceLatitude;


    @Column(name = "des_longitude", nullable = false)
    private Double desLongitude;


    @Column(name = "des_latitude", nullable = false)
    private Double desLatitude;

    @Column(name = "coupon_price", nullable = true)
    private BigDecimal couponPrice;

    @Column(name = "coupon_id", nullable = true)
    private Long couponId;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "prepare_id", nullable = true,length = 60)
    private Date prepareId;

    @Column(name = "create_time", nullable = false)
    private Date createTime;


    @Column(name = "remark", nullable = true, length = 500)
    private String remark;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderImage() {
        return senderImage;
    }

    public void setSenderImage(String senderImage) {
        this.senderImage = senderImage;
    }

    public Date getPrepareId() {
        return prepareId;
    }

    public void setPrepareId(Date prepareId) {
        this.prepareId = prepareId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getSourceLongitude() {
        return sourceLongitude;
    }

    public void setSourceLongitude(Double sourceLongitude) {
        this.sourceLongitude = sourceLongitude;
    }

    public Double getSourceLatitude() {
        return sourceLatitude;
    }

    public void setSourceLatitude(Double sourceLatitude) {
        this.sourceLatitude = sourceLatitude;
    }

    public Double getDesLongitude() {
        return desLongitude;
    }

    public void setDesLongitude(Double desLongitude) {
        this.desLongitude = desLongitude;
    }

    public Double getDesLatitude() {
        return desLatitude;
    }

    public void setDesLatitude(Double desLatitude) {
        this.desLatitude = desLatitude;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void beAdd() {

    }

    public void beUpdate() {

    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
