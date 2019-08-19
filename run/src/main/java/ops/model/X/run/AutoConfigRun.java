package ops.model.X.run;

import ops.model.X.wx.user.EnableWxUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.wx.user"})
@MapperScan("ops.model.X.wx.run")
@EntityScan("ops.model.X.wx.run")
@EnableWxUser
public class AutoConfigRun {
}
