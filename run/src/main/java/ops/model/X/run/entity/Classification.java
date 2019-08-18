package ops.model.X.run.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import ops.model.X.base.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "run_classification", indexes = {@Index(columnList = "open_id")})
public class Classification implements BaseEntity {

    @TableId(type = IdType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 微信用户唯一标识
     */
    @Column(name = "open_id", nullable = false, length = 50)
    private String openId;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
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
}
