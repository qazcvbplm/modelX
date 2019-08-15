package ops.model.X.file.system;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AutoConfigFileSystem.class})
public @interface EnableFileSystem {
}
