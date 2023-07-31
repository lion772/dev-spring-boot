package com.lion772.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
    @Override
    public String getDailyActivities() {
        return "Do push-ups, run on treadmill and finish with bench-press!!!";
    }
}
