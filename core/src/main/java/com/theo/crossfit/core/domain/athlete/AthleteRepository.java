package com.theo.crossfit.core.domain.athlete;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AthleteRepository extends MongoRepository<Athlete, Long> {
    Optional<Athlete> findByAccountId(long accountId);

    List<Athlete> findByAccountIdIn(List<Long> accountIds);
}
