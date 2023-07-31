package com.lion772.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SoccerCoach implements Coach{

    public SoccerCoach() {
        System.out.println("hi");
    }
    @Override
    public String getDailyActivities() {
        return "Score more than one goal per match.";
    }
}

// There's no need to use @Qualifier in the constructor injection
// if there's a @Primary annotation in any of the coach implementations.