package com.ja.myproject.model;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ModelPartida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String localRealizacao;
    private LocalDate dataRealizacao;
    private LocalTime timeBegin;
    private LocalTime timeEnd;

    public ModelPartida() {
    }

    public ModelPartida(String localRealizacao, LocalDate dataRealizacao, LocalTime timeBegin, LocalTime timeEnd) {
        this.localRealizacao = localRealizacao;
        this.dataRealizacao = dataRealizacao;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    public String getLocalRealizacao() {
        return localRealizacao;
    }

    public void setLocalRealizacao(String local) {
        this.localRealizacao = local;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
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
