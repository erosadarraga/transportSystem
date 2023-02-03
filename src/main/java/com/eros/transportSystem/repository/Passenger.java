package com.eros.transportSystem.repository;

public class Passenger extends Person{
    private static int nextId = 1;
    private int id;

    public Passenger() {
        this.id = nextId++;
    }
    public Passenger(String namePerson, int age) {
        super(namePerson, age);
        this.id = nextId++;

    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Passenger.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
