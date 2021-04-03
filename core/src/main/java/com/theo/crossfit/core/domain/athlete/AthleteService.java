package com.theo.crossfit.core.domain.athlete;

import org.springframework.stereotype.Service;

@Service
public class AthleteService {
    private final AthleteRepository athleteRepository;

    AthleteService(AthleteRepository athleteRepository){
        this.athleteRepository = athleteRepository;
    }
}
