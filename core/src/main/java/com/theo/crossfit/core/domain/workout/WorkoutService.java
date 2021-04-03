package com.theo.crossfit.core.domain.workout;

import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
    private final WorkoutRepository workoutRepository;

    WorkoutService(WorkoutRepository workoutRepository){
        this.workoutRepository = workoutRepository;
    }
}
