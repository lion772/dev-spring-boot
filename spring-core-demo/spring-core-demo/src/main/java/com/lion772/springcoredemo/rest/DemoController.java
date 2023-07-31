package com.lion772.springcoredemo.rest;

import com.lion772.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coachDao;

    @Autowired
    public void constructor(@Qualifier("gymDao") Coach coachDao){
        this.coachDao = coachDao;
    }

    //@Autowired
    //public void setCoach(@Qualifier("gymDao") Coach coachDao) {
        //setter injection
    //    this.coachDao = coachDao;
    //}

    @GetMapping("/dailyworkout")
    public String getString() {
        return this.coachDao.getDailyActivities();
    }

    // Behind the scenes
    // Coach CoachImplementation = new CoachImplementation();
    // DemoController demoController = new DemoController(coachImplementation);
}
