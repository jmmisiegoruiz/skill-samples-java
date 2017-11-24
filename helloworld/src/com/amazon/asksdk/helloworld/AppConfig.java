package com.amazon.asksdk.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.amazon.asksdk.helloworld")
public class AppConfig {
    @Bean
    String helloResponseText(){
        return "Hello Spring is working fine!!!";
    }
}
