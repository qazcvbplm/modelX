package ops.model.X.base.entity;

import java.io.Serializable;
import java.util.Date;

public interface BaseEntity extends Serializable {

    Long getId();

    void setId(Long id);

    Date getCreateTime();

    void setCreateTime(Date date);

    /**
     * 添加前调用
     */
    void beAdd();

    /**
     * 更新前调用
     */
    void beUpdate();
}
