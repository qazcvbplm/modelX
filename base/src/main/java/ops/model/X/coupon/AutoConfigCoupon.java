package ops.model.X.coupon;

import ops.model.X.base.EnableBase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.coupon"})
@MapperScan("ops.model.X.coupon.dao")
@EntityScan("ops.model.X.coupon.entity")
@EnableBase
public class AutoConfigCoupon {
}
