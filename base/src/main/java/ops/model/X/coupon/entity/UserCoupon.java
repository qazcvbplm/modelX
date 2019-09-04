package ops.model.X.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_coupon", indexes = {@Index(name = "user_coupon_index", columnList = "user_id,use_type")})
public class UserCoupon implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "full", nullable = false)
    private Integer full;

    @Column(name = "cut", nullable = false)
    private Integer cut;

    @Column(name = "send_type", nullable = true, length = 2)
    private Integer sendType;

    @Column(name = "limit_id", nullable = true)
    private Long limitId;

    @Column(name = "limit_type", nullable = true, length = 2)
    private String limitType;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Column(name = "out_time", nullable = false)
    private Date outTime;

    @Column(name = "use_time", nullable = true)
    private Date useTime;

    @Column(name = "use_type", nullable = false, length = 2)
    private Integer useType;

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getFull() {
        return full;
    }

    public void setFull(Integer full) {
        this.full = full;
    }

    public Integer getCut() {
        return cut;
    }

    public void setCut(Integer cut) {
        this.cut = cut;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Long getLimitId() {
        return limitId;
    }

    public void setLimitId(Long limitId) {
        this.limitId = limitId;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
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

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }
}
