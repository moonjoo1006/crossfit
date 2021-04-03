package com.theo.crossfit.core.domain.athlete;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends MongoRepository<Athlete, Long> {
}
