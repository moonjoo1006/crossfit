package com.theo.crossfit.interfaces.application.test;

import com.google.common.collect.Lists;
import com.theo.crossfit.core.common.WodType;
import com.theo.crossfit.core.common.WorkoutType;
import com.theo.crossfit.core.domain.athlete.AthleteService;
import com.theo.crossfit.core.domain.gym.GymService;
import com.theo.crossfit.core.domain.wod.Wod;
import com.theo.crossfit.core.domain.wod.WodService;
import com.theo.crossfit.core.domain.workout.Workout;
import com.theo.crossfit.core.domain.workout.WorkoutService;
import com.theo.crossfit.interfaces.controller.workout.dto.AthleteDto;
import com.theo.crossfit.interfaces.controller.workout.dto.WorkoutDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TestApplication {
    private final AthleteService athleteService;

    private final GymService gymService;

    private final WodService wodService;

    private final WorkoutService workoutService;

    TestApplication(AthleteService athleteService, GymService gymService, WodService wodService, WorkoutService workoutService){
        this.athleteService = athleteService;
        this.gymService = gymService;
        this.wodService = wodService;
        this.workoutService = workoutService;
    }

    public void saveAthlete(AthleteDto athleteDto) {

    }

    public Wod saveWod(Wod wod){
        return wodService.save(wod);
    }

    public Wod findById(Long id) {
        return wodService.findById(id).orElse(null);
    }

    public void saveWorkout(WorkoutDto workoutDto){


    }

    public List<Workout> getMockWorkouts() {
        return Lists.newArrayList(
                getMockWorkout(1L, 1L, getMockWod(1L, 1L, "Cindy", LocalDate.now(), Lists.newArrayList(WorkoutType.CHIN_UP), WodType.BOX), "20R", Lists.newArrayList("2")),
                getMockWorkout(2L, 2L, getMockWod(1L, 1L, "Cindy", LocalDate.now(), Lists.newArrayList(WorkoutType.CHIN_UP), WodType.BOX), "20R", Lists.newArrayList("2")),
                getMockWorkout(3L, 3L, getMockWod(1L, 1L, "Cindy", LocalDate.now(), Lists.newArrayList(WorkoutType.CHIN_UP), WodType.BOX), "20R", Lists.newArrayList("2")),
                getMockWorkout(4L, 4L, getMockWod(1L, 1L, "Cindy", LocalDate.now(), Lists.newArrayList(WorkoutType.CHIN_UP), WodType.BOX), "20R", Lists.newArrayList("2")),
                getMockWorkout(5L, 5L, getMockWod(1L, 1L, "Cindy", LocalDate.now(), Lists.newArrayList(WorkoutType.CHIN_UP), WodType.BOX), "20R", Lists.newArrayList("2")),
                getMockWorkout(6L, 6L, getMockWod(1L, 1L, "Cindy", LocalDate.now(), Lists.newArrayList(WorkoutType.CHIN_UP), WodType.BOX), "20R", Lists.newArrayList("2"))
        );
    }

    private Workout getMockWorkout(Long id, Long athleteId, Wod wod, String record, List<String> likes) {
        Workout workout = new Workout();
        workout.setId(id);
        workout.setAthleteId(athleteId);
        workout.setWod(wod);
        workout.setRecord(record);
        workout.setLikes(likes);
        return workout;
    }

    private Wod getMockWod(Long id, Long gymId, String workout, LocalDate workoutDate, List<WorkoutType> workoutTypes, WodType wodType){
        Wod wod = new Wod();
        wod.setId(id);
        wod.setGymId(gymId);
        wod.setWorkout(workout);
        wod.setWorkoutDate(workoutDate);
        wod.setWorkoutTypes(workoutTypes);
        wod.setWodType(wodType);
        return wod;
    }
}
