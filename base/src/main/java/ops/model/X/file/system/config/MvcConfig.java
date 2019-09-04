package ops.model.X.file.system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Value("${file.path:d://}")
    private String path;

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/model/image/**").addResourceLocations("file:" + path);
    }

}
