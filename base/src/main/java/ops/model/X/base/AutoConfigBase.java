package ops.model.X.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.base"})
@MapperScan("ops.model.X.base")
public class AutoConfigBase {
}
