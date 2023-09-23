package com.gs.tfs.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * author: gayan
 * created: 2023-09-23
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.gs.tfs.rest.controller")
public class TaskFlowWebConfig implements WebMvcConfigurer
{
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter()
    {
        final var convertor = new MappingJackson2HttpMessageConverter();
        convertor.setObjectMapper(new ObjectMapper());
        return convertor;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters)
    {
        converters.add(mappingJackson2HttpMessageConverter());
    }
}
