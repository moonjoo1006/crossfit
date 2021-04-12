package com.theo.crossfit.core.domain.athlete;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthleteService {
    private final AthleteRepository athleteRepository;

    AthleteService(AthleteRepository athleteRepository){
        this.athleteRepository = athleteRepository;
    }

    public Athlete save(Athlete athlete){
        String sequenceName = athlete.getSequenceName();
        return athleteRepository.save(athlete);
    }

    public Optional<Athlete> findByAccountId(long accountId) {
        return athleteRepository.findByAccountId(accountId);
    }

    public List<Athlete> findByAccountIdIn(List<Long> accountIds) {
        return athleteRepository.findByAccountIdIn(accountIds);
    }
}
