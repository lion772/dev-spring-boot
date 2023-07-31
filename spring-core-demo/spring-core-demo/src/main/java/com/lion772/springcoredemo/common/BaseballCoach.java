package com.lion772.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyActivities() {
        return "Spend 30 minutes in batting practice";
    }
}
