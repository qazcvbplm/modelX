package ops.model.X.coupon.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.coupon.dao.UserCouponDao;
import ops.model.X.coupon.entity.UserCoupon;
import ops.model.X.coupon.service.UserCouponService;
import org.springframework.stereotype.Service;

@Service
public class UserCouponServiceImpl extends OpsServiceImpl<UserCouponDao, UserCoupon> implements UserCouponService {
}
