package ops.model.X.run.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "run_order", uniqueConstraints = {@UniqueConstraint(columnNames = "order_id")}, indexes = {@Index(columnList = "open_id")})
public class RunOrder implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id", nullable = false, length = 50)
    private String orderId;

    @Column(name = "source_user_id", nullable = false)
    private Long sourceOpenId;

    @Column(name = "des_user_id", nullable = true)
    private Long desOpenId;

    @Column(name = "source_user_obj", nullable = false, length = 50)
    private String sourceUserObj;

    @Column(name = "des_user_obj", nullable = true, length = 50)
    private String desUserObj;


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

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "remark", nullable = true, length = 500)
    private String remark;


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

    public Long getSourceOpenId() {
        return sourceOpenId;
    }

    public void setSourceOpenId(Long sourceOpenId) {
        this.sourceOpenId = sourceOpenId;
    }

    public Long getDesOpenId() {
        return desOpenId;
    }

    public void setDesOpenId(Long desOpenId) {
        this.desOpenId = desOpenId;
    }

    public String getSourceUserObj() {
        return sourceUserObj;
    }

    public void setSourceUserObj(String sourceUserObj) {
        this.sourceUserObj = sourceUserObj;
    }

    public String getDesUserObj() {
        return desUserObj;
    }

    public void setDesUserObj(String desUserObj) {
        this.desUserObj = desUserObj;
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
