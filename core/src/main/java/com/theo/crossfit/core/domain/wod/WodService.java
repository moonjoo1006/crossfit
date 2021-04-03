package com.theo.crossfit.core.domain.wod;

import org.springframework.stereotype.Service;

@Service
public class WodService {
    private final WodRepository wodRepository;

    WodService(WodRepository wodRepository) {
        this.wodRepository = wodRepository;
    }
}
