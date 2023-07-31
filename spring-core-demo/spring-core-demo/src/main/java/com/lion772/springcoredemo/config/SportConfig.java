package com.lion772.springcoredemo.config;

import com.lion772.springcoredemo.common.Coach;
import com.lion772.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

    // Creating a bean manually like this allows un to take existing third-party library and expose as a Spring bean.
}
