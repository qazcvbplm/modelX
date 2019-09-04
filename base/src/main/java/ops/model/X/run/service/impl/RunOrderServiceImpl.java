package ops.model.X.run.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.run.dao.RunOrderDao;
import ops.model.X.run.entity.RunOrder;
import ops.model.X.run.service.RunOrderService;
import org.springframework.stereotype.Service;

@Service
public class RunOrderServiceImpl extends OpsServiceImpl<RunOrderDao, RunOrder> implements RunOrderService {
}
