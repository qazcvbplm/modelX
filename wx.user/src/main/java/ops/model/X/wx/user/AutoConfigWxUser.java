package ops.model.X.wx.user;

import ops.model.X.base.EnableBase;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"ops.model.X.wx.user"})
@MapperScan("ops.model.X.wx.user.dao")
@EntityScan("ops.model.X.wx.user.entity")
@EnableBase
public class AutoConfigWxUser {
}
