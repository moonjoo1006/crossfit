package com.theo.crossfit.core.common;

import lombok.Getter;

@Getter
public enum WorkoutType {
    DEAD_LIFT("데드리프트"),
    SQUAT("스쿼트"),
    PUSH_UP("푸시업"),
    CHIN_UP("친업");

    private String desc;

    WorkoutType(String desc) {
        this.desc = desc;
    }
}
