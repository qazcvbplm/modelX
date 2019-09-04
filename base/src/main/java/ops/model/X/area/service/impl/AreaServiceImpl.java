package ops.model.X.area.service.impl;

import ops.model.X.area.dao.AreaDao;
import ops.model.X.area.entity.Area;
import ops.model.X.area.service.AreaService;
import ops.model.X.base.service.OpsServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl extends OpsServiceImpl<AreaDao, Area> implements AreaService {
}
