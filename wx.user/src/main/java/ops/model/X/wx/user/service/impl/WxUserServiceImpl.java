package ops.model.X.wx.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ops.model.X.wx.user.dao.WxUserDao;
import ops.model.X.wx.user.entity.WxUser;
import ops.model.X.wx.user.service.WxUserService;
import org.springframework.stereotype.Service;

@Service
public class WxUserServiceImpl extends ServiceImpl<WxUserDao, WxUser> implements WxUserService {
}
