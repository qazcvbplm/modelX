import com.ops.school.App;
import ops.model.X.wx.user.entity.WxUser;
import ops.model.X.wx.user.service.WxUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class Test {


    @Autowired
    private WxUserService wxUserService;

    @org.junit.Test
    public void test() {
        WxUser wxUser = new WxUser();
        wxUser.setOpenId("asdasdas");
        wxUserService.save(wxUser);
    }


}
