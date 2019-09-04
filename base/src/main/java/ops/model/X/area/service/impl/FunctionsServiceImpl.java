package ops.model.X.area.service.impl;

import ops.model.X.area.dao.FunctionsDao;
import ops.model.X.area.entity.Functions;
import ops.model.X.area.service.FunctionsService;
import ops.model.X.base.service.OpsServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FunctionsServiceImpl extends OpsServiceImpl<FunctionsDao, Functions> implements FunctionsService {
}
