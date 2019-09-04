package ops.model.X.min.app.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.min.app.dao.MinMessageDao;
import ops.model.X.min.app.entity.MinMessage;
import ops.model.X.min.app.service.MinMessageService;
import org.springframework.stereotype.Service;

@Service
public class MinMessageServiceImpl extends OpsServiceImpl<MinMessageDao, MinMessage> implements MinMessageService {
}
