package ops.model.X.base.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ops.model.X.base.entity.BaseEntity;

import java.util.Date;

public class OpsServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

    @Override
    public boolean save(T entity) {
        if (entity instanceof BaseEntity) {
            ((BaseEntity) entity).setCreateTime(new Date());
            ((BaseEntity) entity).beAdd();
        }
        return super.save(entity);
    }
}
