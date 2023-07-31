package com.lion772.springcoredemo.common;

import org.springframework.context.annotation.Configuration;

public class SwimCoach implements Coach  {

    public void SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    @Override
    public String getDailyActivities() {
        return "Swim 1000 meters as a warm up";
    }
}
