package ops.model.X.min.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ops.model.X.min.app.dao.MinAppDao;
import ops.model.X.min.app.entity.MinApp;
import ops.model.X.min.app.service.MinAppService;
import org.springframework.stereotype.Service;

@Service
public class MinAppServiceImpl extends ServiceImpl<MinAppDao, MinApp> implements MinAppService {
}
