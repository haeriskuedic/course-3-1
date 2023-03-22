package com.udacity.course3.data;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Entity
public class Flower extends Plant {
    private String color;

    /**
     * getters and setters
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
