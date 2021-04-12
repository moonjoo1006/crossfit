package com.theo.crossfit.core.configuration;

import com.theo.crossfit.core.domain.Domain;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = Domain.class)
public class MongoDBConfiguration {


}
