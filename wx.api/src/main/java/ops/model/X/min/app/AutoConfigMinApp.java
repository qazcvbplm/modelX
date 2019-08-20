package ops.model.X.min.app;

import ops.model.X.base.EnableBase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.min.app"})
@MapperScan("ops.model.X.min.app.dao")
@EntityScan("ops.model.X.min.app.entity")
@EnableBase
public class AutoConfigMinApp {
}
