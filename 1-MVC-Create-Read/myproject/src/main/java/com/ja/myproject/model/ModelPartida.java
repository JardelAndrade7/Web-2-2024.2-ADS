package com.ja.myproject.model;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class ModelPartida {
    private String local;
    private LocalDate data;
    private LocalTime timeBegin;
    private LocalTime timeEnd;

    public ModelPartida() {
    }

    public ModelPartida(String local, LocalDate data, LocalTime timeBegin, LocalTime timeEnd) {
        this.local = local;
        this.data = data;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(LocalTime timeBegin) {
        this.timeBegin = timeBegin;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Long calculeDuration () {
        Duration durationDuration = Duration.between(this.timeBegin, this.timeEnd);
        Long duration = durationDuration.toHours();
        return duration;
    }
}
