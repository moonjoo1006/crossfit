package com.theo.crossfit.interfaces.controller.workout;


import com.google.common.collect.Lists;
import com.theo.crossfit.core.domain.workout.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/workout")
public class WorkoutController {

    @GetMapping("/")
    public List<Workout> getWorkouts() {


        return Lists.newArrayList();
    }
}
