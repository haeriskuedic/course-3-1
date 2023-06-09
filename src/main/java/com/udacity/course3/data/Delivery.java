package com.udacity.course3.data;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;
import java.util.List;

@NamedQuery(name = "Delivery.findByName", query = "select d from Delivery d where d.name = :name")
@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;
    @Column(name = "address_full", length = 500)
    private String address;
    private LocalDateTime deliveryTime; // includes both date and time - simpler than having two separate fields
    //@Type(type = "yes_no") // deprecated
    private Boolean completed;


    // Lazy fetch is optional, but often a good idea for collection attributes
    // added CascadeType.REMOVE to automatically clear any associated plants when removed
    // changed CascadeType to ALL
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Plant> plants;

    /**
     * getters and setters
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
