package com.example.projecttechwiz3.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PersonalHealthVitals {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private long id;
    @Basic
    @Column(name = "User_id")
    private Long userId;
    @Basic
    @Column(name = "Weight")
    private String weight;
    @Basic
    @Column(name = "Height")
    private String height;
    @Basic
    @Column(name = "BloodPressure")
    private String bloodPressure;
    @Basic
    @Column(name = "BloodGlucose")
    private String bloodGlucose;
    @Basic
    @Column(name = "BloodOxygen")
    private String bloodOxygen;
    @Basic
    @Column(name = "BodyTemperature")
    private String bodyTemperature;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(String bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }

    public String getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(String bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public String getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(String bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalHealthVitals that = (PersonalHealthVitals) o;
        return id == that.id && Objects.equals(userId, that.userId) && Objects.equals(weight, that.weight) && Objects.equals(height, that.height) && Objects.equals(bloodPressure, that.bloodPressure) && Objects.equals(bloodGlucose, that.bloodGlucose) && Objects.equals(bloodOxygen, that.bloodOxygen) && Objects.equals(bodyTemperature, that.bodyTemperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, weight, height, bloodPressure, bloodGlucose, bloodOxygen, bodyTemperature);
    }
}
