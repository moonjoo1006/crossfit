package com.theo.crossfit.core.domain.workout;

import com.theo.crossfit.core.domain.SequenceGenerator;

import com.theo.crossfit.core.domain.wod.Wod;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("workout")
@Getter
@Setter
public class Workout implements SequenceGenerator {
    @Id
    private long id;

    private long athleteId;

    private Wod wod;

    private String record;

    private List<String> likes;

    @Override
    public String getSequenceName() {
        return "workout_sequence";
    }
}
