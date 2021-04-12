package com.theo.crossfit.interfaces.controller.workout;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AthleteDto {
    private Long id;

    private String name;

    private String gymId;

    private Long accountId;
}
