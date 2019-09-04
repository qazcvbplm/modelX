package ops.model.X.min.app.service.impl;

import ops.model.X.base.service.OpsServiceImpl;
import ops.model.X.min.app.dao.MinAppDao;
import ops.model.X.min.app.entity.MinApp;
import ops.model.X.min.app.service.MinAppService;
import org.springframework.stereotype.Service;

@Service
public class MinAppServiceImpl extends OpsServiceImpl<MinAppDao, MinApp> implements MinAppService {
}
