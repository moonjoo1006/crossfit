package com.theo.crossfit.core.domain.gym;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GymRepository extends MongoRepository<Gym, Long> {
    Optional<Gym> findById(String id);
}
