package com.udacity.course3.data;

import jakarta.persistence.Entity;

@Entity
public class Shrub extends Plant {
    private int heightCm;
    private int widthCm;

    /**
     * getters and setters
     */
    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(int widthCm) {
        this.widthCm = widthCm;
    }
}
