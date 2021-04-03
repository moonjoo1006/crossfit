package com.theo.crossfit.core.domain.wod;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WodRepository extends MongoRepository<Wod, Long> {
}
