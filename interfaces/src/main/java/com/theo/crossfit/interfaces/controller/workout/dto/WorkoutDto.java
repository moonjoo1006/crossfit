package com.theo.crossfit.interfaces.controller.workout.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WorkoutDto {
    private long id;

    private String record;

    private List<String> likes;
}
