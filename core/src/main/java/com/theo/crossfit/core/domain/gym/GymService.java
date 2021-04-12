package com.theo.crossfit.core.domain.gym;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymService {
    private final GymRepository gymRepository;

    public GymService(GymRepository gymRepository){
        this.gymRepository = gymRepository;
    }

    public List<Gym> findByGymIdIn(List<Long> gymIds) {
        return gymRepository.findByGymIdIn(gymIds);
    }
}
