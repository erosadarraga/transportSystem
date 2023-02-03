package com.eros.transportSystem.repository;

import java.util.Calendar;
import java.util.List;

public class Destination extends Town {
    private Bus bus;
    private List<String>Horarios;
    private static int nextId = 1;
    private int id;


    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Destination.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public List<String> getHorarios() {
        return Horarios;
    }

    public void setHorarios(List<String> horarios) {
        Horarios = horarios;
    }


    public Destination(String cityName) {
        super(cityName);
    }

    public Destination() {
        this.id = nextId++;
    }

    public Destination(String cityName, Bus bus,List<String>horarios) {
        super(cityName);
        this.Horarios= horarios;
        this.bus = bus;
        this.id = nextId++;
    }
}
