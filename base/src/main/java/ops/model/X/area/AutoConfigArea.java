package ops.model.X.area;

import ops.model.X.base.EnableBase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.area"})
@MapperScan("ops.model.X.area.dao")
@EntityScan("ops.model.X.area.entity")
@EnableBase
public class AutoConfigArea {
}
