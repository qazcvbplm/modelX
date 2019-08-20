package ops.model.X.min.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ops.model.X.min.app.dao.MinMessageDao;
import ops.model.X.min.app.entity.MinMessage;
import ops.model.X.min.app.service.MinMessageService;
import org.springframework.stereotype.Service;

@Service
public class MinMessageServiceImpl extends ServiceImpl<MinMessageDao, MinMessage> implements MinMessageService {
}
