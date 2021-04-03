package com.theo.crossfit.core.domain.athlete;

import com.theo.crossfit.core.domain.SequenceGenerator;
import com.theo.crossfit.core.domain.workout.Workout;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "athlete")
public class Athlete implements SequenceGenerator {
    @Id
    private Long id;

    private String name;

    private String gymId;

    private long accountId;

    private List<Long> follows;

    private List<Long> followers;

    private List<Workout> feeds;

    @Override
    public String getSequenceName() {
        return "athlete_generator";
    }
}
