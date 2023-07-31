package com.lion772.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component("baseballDao")
public class BaseballCoach implements Coach{
    @Override
    public String getDailyActivities() {
        return "Spend 30 minutes in batting practice";
    }
}
