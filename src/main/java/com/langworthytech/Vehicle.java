package com.langworthytech;

import java.util.Objects;

public class Vehicle {

    private String year;

    private String make;

    private String model;

    private String trim;

    public Vehicle(String year, String make, String model, String trim) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year.equals(vehicle.year) &&
                make.equals(vehicle.make) &&
                model.equals(vehicle.model) &&
                trim.equals(vehicle.trim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, make, model, trim);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }
}
