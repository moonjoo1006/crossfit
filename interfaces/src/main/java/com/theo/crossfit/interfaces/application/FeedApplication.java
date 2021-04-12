package com.theo.crossfit.interfaces.application;

import com.google.common.collect.Lists;
import com.theo.crossfit.core.domain.athlete.Athlete;
import com.theo.crossfit.core.domain.athlete.AthleteService;
import com.theo.crossfit.core.domain.gym.Gym;
import com.theo.crossfit.core.domain.gym.GymService;
import com.theo.crossfit.core.domain.wod.Wod;
import com.theo.crossfit.core.domain.workout.Workout;
import com.theo.crossfit.interfaces.controller.feed.dto.FeedDto;
import com.theo.crossfit.interfaces.controller.workout.dto.AthleteDto;
import com.theo.crossfit.interfaces.controller.workout.dto.GymDto;
import com.theo.crossfit.interfaces.controller.workout.dto.WodDto;
import com.theo.crossfit.interfaces.controller.workout.dto.WorkoutDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class FeedApplication {
    private final AthleteService athleteService;

    private final GymService gymService;

    FeedApplication(AthleteService athleteService, GymService gymService) {
        this.athleteService = athleteService;
        this.gymService = gymService;
    }

    public List<FeedDto> getFeeds(long accountId) {
        Optional<Athlete> optAthlete = athleteService.findByAccountId(accountId);
        if (optAthlete.isEmpty()) {
            return Lists.newArrayList();
        }
        Athlete athlete = optAthlete.get();
        List<Workout> feeds = athlete.getFeeds();

        List<Long> athleteIds = feeds.stream().map(Workout::getAthleteId).collect(Collectors.toList());
        Map<Long, Athlete> athleteMap = athleteService.findByAccountIdIn(athleteIds).stream().collect(Collectors.toMap(Athlete::getId, Function.identity()));

        List<Long> gymIds = feeds.stream().map(Workout::getWod).map(Wod::getGymId).collect(Collectors.toList());
        Map<Long, Gym> gymMap = gymService.findByGymIdIn(gymIds).stream().collect(Collectors.toMap(Gym::getId, Function.identity()));

        return feeds.stream().map(feed -> {
            FeedDto feedDto = new FeedDto();
            WorkoutDto workoutDto = new WorkoutDto();
            GymDto gymDto = new GymDto();
            WodDto wodDto = new WodDto();
            AthleteDto athleteDto = new AthleteDto();


            feedDto.setWod(wodDto);
            feedDto.setWorkout(workoutDto);
            feedDto.setAthlete(athleteDto);
            return feedDto;
        }).collect(Collectors.toList());
    }
}
