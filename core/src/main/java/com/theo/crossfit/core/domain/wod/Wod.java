package com.theo.crossfit.core.domain.wod;

import com.theo.crossfit.core.common.WorkoutType;
import com.theo.crossfit.core.domain.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document(collection = "wod")
public class Wod implements SequenceGenerator {
    @Transient
    public static final String SEQUENCE_NAME = "wod_sequence";

    @Id
    private String id;

    private String gymId;

    private String workout;

    private LocalDateTime workoutDate;

    private List<WorkoutType> workoutTypes;


    @Override
    public String getSequenceName() {
        return "wod_sequence";
    }
}
