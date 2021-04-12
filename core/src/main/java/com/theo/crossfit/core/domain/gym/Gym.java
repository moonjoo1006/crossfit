package com.theo.crossfit.core.domain.gym;

import com.theo.crossfit.core.domain.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection ="gym")
public class Gym implements SequenceGenerator {
    @Id
    public Long id;

    public String name;

    public String address;

    private String ownerId;

    private List<String> managerIds;

    @Override
    public String getSequenceName() {
        return "gym_generator";
    }
}
