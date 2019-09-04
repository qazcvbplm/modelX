package ops.model.X.min.app;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AutoConfigMinApp.class})
public @interface EnableMinApp {
}
