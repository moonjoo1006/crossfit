package com.theo.crossfit.core.domain.wod;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WodService {
    private final WodRepository wodRepository;

    WodService(WodRepository wodRepository) {
        this.wodRepository = wodRepository;
    }

    public Wod save(Wod wod) {
        return wodRepository.save(wod);
    }

    public Optional<Wod> findById(Long id){
        return wodRepository.findById(id);
    }
}
