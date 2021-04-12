package com.theo.crossfit.interfaces.controller.feed.dto;

import com.theo.crossfit.interfaces.controller.workout.dto.AthleteDto;
import com.theo.crossfit.interfaces.controller.workout.dto.GymDto;
import com.theo.crossfit.interfaces.controller.workout.dto.WodDto;
import com.theo.crossfit.interfaces.controller.workout.dto.WorkoutDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedDto {
    /**
     * 운동 기록
     * */
    private WorkoutDto workout;

    /**
     * 와드
     * */
    private WodDto wod;

    /**
     * 운동한 사람
     * */
    private AthleteDto athlete;

    /**
     * 박스정보(nullable)
     * */
    private GymDto gym;
}
