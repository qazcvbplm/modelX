package ops.model.X.run.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ops.model.X.run.dao.RunOrderDao;
import ops.model.X.run.entity.RunOrder;
import ops.model.X.run.service.RunOrderService;
import org.springframework.stereotype.Service;

@Service
public class RunOrderServiceImpl extends ServiceImpl<RunOrderDao, RunOrder> implements RunOrderService {
}
