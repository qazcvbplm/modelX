package ops.model.X.base.config;

import ops.model.X.base.util.SpringUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class UtilConfig {

    @Bean
    @Primary
    @ConditionalOnMissingBean(SpringUtil.class)
    public SpringUtil getSpringUtil() {
        return new SpringUtil();
    }
}
