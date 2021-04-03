package com.theo.crossfit.interfaces.application;

import com.google.common.collect.Lists;
import com.theo.crossfit.core.domain.workout.WorkoutService;
import com.theo.crossfit.interfaces.controller.workout.WorkoutDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutApplication {
    private final WorkoutService workoutService;

    WorkoutApplication(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    public List<WorkoutDto> getWorkouts(long accountId) {



        return Lists.newArrayList();
    }
}
