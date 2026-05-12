package kr.ac.kopo.dgj._026example.configure;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // handler라는 이름으로 부르고, 그 이름의 locations를 d의 upload 파일로 설정.
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:///d:/upload/");
    }
}
