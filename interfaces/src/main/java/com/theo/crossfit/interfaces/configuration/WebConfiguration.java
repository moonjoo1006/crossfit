package com.theo.crossfit.interfaces.configuration;

import com.theo.crossfit.interfaces.controller.Api;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackageClasses = Api.class)
public class WebConfiguration implements WebMvcConfigurer {

}
