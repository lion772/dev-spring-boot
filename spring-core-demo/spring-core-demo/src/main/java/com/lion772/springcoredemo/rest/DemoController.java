package com.lion772.springcoredemo.rest;

import com.lion772.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coachDao;

    @Autowired
    public void constructor(Coach coachDao){
        this.coachDao = coachDao;
    }

    @GetMapping("/dailyworkout")
    public String getString() {
        return this.coachDao.getDailyActivities();
    }
}
