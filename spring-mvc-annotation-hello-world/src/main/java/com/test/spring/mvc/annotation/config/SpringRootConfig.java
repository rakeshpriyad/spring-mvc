package com.test.spring.mvc.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.test.spring.mvc.annotation.service" })
public class SpringRootConfig {
}