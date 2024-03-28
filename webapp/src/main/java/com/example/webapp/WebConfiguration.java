package com.example.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration {

    @Bean
    public WebMvcConfigurer forwardToIndex() {
        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(@NonNull ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("forward:/vue-page/index.html");
                registry.addViewController("/vue-page/{spring:\\w+}").setViewName("forward:/");
                registry.addViewController("/vue-page/**/{spring:\\w+}").setViewName("forward:/");
            }
        };
    }

}
