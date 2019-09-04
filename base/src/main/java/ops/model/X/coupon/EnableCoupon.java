package ops.model.X.coupon;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AutoConfigCoupon.class})
public @interface EnableCoupon {
}
