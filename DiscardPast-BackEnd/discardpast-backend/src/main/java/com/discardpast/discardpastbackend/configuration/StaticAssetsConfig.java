package com.discardpast.discardpastbackend.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class StaticAssetsConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myTest/**").addResourceLocations("file:D:/DiscardPast.com/DiscardPast-BackEnd/Music/AlbumImage");
        super.addResourceHandlers(registry);
    }
}
