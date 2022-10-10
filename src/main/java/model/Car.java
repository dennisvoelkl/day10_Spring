package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Car {
    private UUID id;
    private String manufacturName;
    //private int numbersOfWheels;
    //private boolean plakette;


    public Car(@JsonProperty("id") UUID id,
               @JsonProperty("manufacturName") String manufacturName) {
        this.id = id;
        this.manufacturName = manufacturName;
    }

    public String getManufacturName() {
        return manufacturName;
    }

    public UUID getId() {
        return id;
    }
}
