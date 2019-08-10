package ops.model.X.wx.user;

import ops.model.X.base.EnableBase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.wx.user"})
@MapperScan("ops.model.X.wx.user.dao")
@EnableBase
public class AutoConfigWxUser {
}
