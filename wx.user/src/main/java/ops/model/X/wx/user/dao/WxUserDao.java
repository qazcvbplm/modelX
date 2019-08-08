package ops.model.X.wx.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ops.model.X.wx.user.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WxUserDao extends BaseMapper<WxUser> {
}
