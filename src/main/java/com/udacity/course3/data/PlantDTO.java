package com.udacity.course3.data;

import java.math.BigDecimal;

public class PlantDTO {
    private String name;
    private BigDecimal price;

   /**  getters and setters */
   public String getName() {
       return name;
   }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
