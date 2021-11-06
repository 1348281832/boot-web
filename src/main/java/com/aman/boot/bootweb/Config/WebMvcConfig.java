package com.aman.boot.bootweb.Config;

import com.aman.boot.bootweb.Bean.TomcatPet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration(proxyBeanMethods = false)
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, TomcatPet>() {

                    @Override
                    public TomcatPet convert(String source) {
                        TomcatPet pet = new TomcatPet();
                        String[] split = source.split(",");
                        pet.setName(split[0]);
                        pet.setType(split[1]);
                        return pet;
                    }
                });
            }
        };

    }
}
