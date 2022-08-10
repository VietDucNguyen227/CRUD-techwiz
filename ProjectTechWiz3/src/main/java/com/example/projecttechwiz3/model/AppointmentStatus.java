package com.example.projecttechwiz3.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class AppointmentStatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NotificationId")
    private long notificationId;
    @Basic
    @Column(name = "UserId")
    private Long userId;
    @Basic
    @Column(name = "Date")
    private Date date;
    @Basic
    @Column(name = "Time")
    private Object time;
    @Basic
    @Column(name = "Location")
    private String location;
    @Basic
    @Column(name = "Description")
    private String description;

    public long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Object getTime() {
        return time;
    }

    public void setTime(Object time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentStatus that = (AppointmentStatus) o;
        return notificationId == that.notificationId && Objects.equals(userId, that.userId) && Objects.equals(date, that.date) && Objects.equals(time, that.time) && Objects.equals(location, that.location) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, userId, date, time, location, description);
    }
}
