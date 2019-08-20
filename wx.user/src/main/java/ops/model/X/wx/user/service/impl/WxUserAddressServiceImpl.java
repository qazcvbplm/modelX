package ops.model.X.wx.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ops.model.X.wx.user.dao.WxUserAddressDao;
import ops.model.X.wx.user.entity.WxUserAddress;
import ops.model.X.wx.user.service.WxUserAddressService;
import org.springframework.stereotype.Service;

@Service
public class WxUserAddressServiceImpl extends ServiceImpl<WxUserAddressDao, WxUserAddress> implements WxUserAddressService {
}
