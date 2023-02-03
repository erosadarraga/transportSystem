package com.eros.transportSystem.repository;

public abstract class  Town {
    private String cityName;

    public Town(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Town() {
    }
}
