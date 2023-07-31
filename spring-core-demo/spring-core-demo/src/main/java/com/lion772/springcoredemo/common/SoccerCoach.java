package com.lion772.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class SoccerCoach implements Coach{

    public SoccerCoach() {
        System.out.println("hi");
    }

    @PostConstruct
    public void doSomeStuffAfterBeanInitialization() {
        System.out.println("Bean has been constructed and initialized!");
    }

    @PreDestroy
    public void doSomeStuffBeforeBeanIsDestroyed() {
        System.out.println("Run for your lives! this bean's gonna be destroyed!");
    }

    @Override
    public String getDailyActivities() {
        return "Score more than one goal per match.";
    }
}

// There's no need to use @Qualifier in the constructor injection
// if there's a @Primary annotation in any of the coach implementations.