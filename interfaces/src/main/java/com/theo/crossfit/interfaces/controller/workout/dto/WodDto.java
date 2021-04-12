package com.theo.crossfit.interfaces.controller.workout.dto;

import com.theo.crossfit.core.common.WodType;
import com.theo.crossfit.core.common.WorkoutType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WodDto {
    private long id;

    private String workout;

    private String LocalDate;

    private List<WorkoutType> workoutTypes;

    private WodType wodType;
}
