package com.eros.transportSystem.repository;

import java.util.List;

public class Bus extends Vehicles{
    private static int nextId = 1;
    private int id;
    private String name;

    private Passenger passenger;

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Bus.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    private String destination;



    public Bus(String name, int price, int size, Passenger passenger, String destination) {
        super(price, size, passenger);
        this.destination= destination;
        this.passenger= passenger;
        this.name= name;
        this.id = nextId++;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    @Override
    public List<Passenger> GetAllPaPassengers() {
        return null;
    }
}
