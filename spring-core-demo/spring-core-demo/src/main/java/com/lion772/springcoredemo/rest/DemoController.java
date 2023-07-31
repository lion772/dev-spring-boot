package com.lion772.springcoredemo.rest;

import com.lion772.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mySoccerCoach;
    private Coach notMySoccerCoach;


    @Autowired
    public void constructor(
            @Qualifier("soccerCoach") Coach soccerCoach,
            @Qualifier("soccerCoach") Coach anotherSoccerCoach
    ){
        mySoccerCoach = soccerCoach;
        notMySoccerCoach = anotherSoccerCoach;
    }

    //@Autowired
    //public void setCoach(@Qualifier("gymDao") Coach coachDao) {
        //setter injection
    //    this.coachDao = coachDao;
    //}

    @GetMapping("/dailyworkout")
    public String getString() {
        return mySoccerCoach.getDailyActivities() + " " + notMySoccerCoach.getDailyActivities();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: mySoccerCoach == notMySoccerCoach: " + (mySoccerCoach == notMySoccerCoach);
    }

    // Behind the scenes
    // Coach soccerCoach = new SoccerCoach(); // <--- implementation
    // DemoController demoController = new DemoController(soccerCoach);
}
