package ops.model.X.coupon.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.coupon.dao.CouponDao;
import ops.model.X.coupon.entity.Coupon;
import ops.model.X.coupon.service.CouponService;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl extends OpsServiceImpl<CouponDao, Coupon> implements CouponService {
}
