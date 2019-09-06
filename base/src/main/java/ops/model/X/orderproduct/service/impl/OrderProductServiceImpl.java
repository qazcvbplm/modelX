package ops.model.X.orderproduct.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.orderproduct.dao.OrderProductDao;
import ops.model.X.orderproduct.entity.OrderProduct;
import ops.model.X.orderproduct.service.OrderProductService;
import org.springframework.stereotype.Service;

@Service
public class OrderProductServiceImpl extends OpsServiceImpl<OrderProductDao, OrderProduct> implements OrderProductService {
}
