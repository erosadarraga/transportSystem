package com.eros.transportSystem.repository;

import java.util.List;

public abstract class Vehicles {
    private int price ;
    private int Size ;


    private Passenger passenger;

    public Vehicles() {
    }

    public Vehicles(int price, int size, Passenger passenger) {
        this();
        this.price = price;
        Size = size;
        this.passenger = passenger;
    }

    abstract public List<Passenger> GetAllPaPassengers();
}
