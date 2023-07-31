package com.lion772.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyActivities() {
        return "Practice your backhand volley";
    }
}
