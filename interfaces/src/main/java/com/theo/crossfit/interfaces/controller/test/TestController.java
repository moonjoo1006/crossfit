package com.theo.crossfit.interfaces.controller.test;

import com.theo.crossfit.core.domain.wod.Wod;
import com.theo.crossfit.core.domain.workout.Workout;
import com.theo.crossfit.interfaces.application.test.TestApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestApplication testApplication;

    TestController(TestApplication testApplication){
        this.testApplication = testApplication;
    }

    @PostMapping(value = "/workouts/save")
    public String saveWorkouts(List<Workout> workouts){



        return "success";
    }

    @PostMapping(value = "/wod/save")
    public Wod saveWod(@RequestBody Wod wod){
        return testApplication.saveWod(wod);
    }

    @GetMapping(value = "/wods/{id}")
    public Wod findById(@PathVariable Long id) {
        return testApplication.findById(id);

    }

    @GetMapping("/mock/workouts")
    public List<Workout> getWorkouts() {
        return testApplication.getMockWorkouts();
    }
}
