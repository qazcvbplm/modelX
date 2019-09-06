package ops.model.X.orderproduct;

import ops.model.X.wx.user.EnableWxUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.orderproduct"})
@MapperScan("ops.model.X.orderproduct")
@EntityScan("ops.model.X.orderproduct")
@EnableWxUser
public class AutoConfigOp {
}
