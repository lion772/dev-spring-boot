package com.lion772.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component("soccerDao")
public class SoccerCoach implements Coach{
    @Override
    public String getDailyActivities() {
        return "Score more than one goal pro match.";
    }
}
