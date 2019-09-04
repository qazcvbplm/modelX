package ops.model.X.wx.user;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AutoConfigWxUser.class})
public @interface EnableWxUser {
}
