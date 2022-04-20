package com.home;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.home")
@PropertySource("classpath:values.properties")
public class SpringContext {
}
