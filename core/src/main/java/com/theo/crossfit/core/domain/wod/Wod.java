package com.theo.crossfit.core.domain.wod;

import com.theo.crossfit.core.common.WodType;
import com.theo.crossfit.core.common.WorkoutType;
import com.theo.crossfit.core.domain.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "wod")
@Getter
@Setter
public class Wod implements SequenceGenerator {
    @Id
    private long id;

    private long gymId;

    private String workout;

    private LocalDate workoutDate;

    private List<WorkoutType> workoutTypes;

    private WodType wodType;

    @Override
    public String getSequenceName() {
        return "wod_sequence";
    }
}
