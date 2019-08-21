package ops.model.X.wx.user.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.wx.user.dao.WxUserAddressDao;
import ops.model.X.wx.user.entity.WxUserAddress;
import ops.model.X.wx.user.service.WxUserAddressService;
import org.springframework.stereotype.Service;

@Service
public class WxUserAddressServiceImpl extends OpsServiceImpl<WxUserAddressDao, WxUserAddress> implements WxUserAddressService {
}
