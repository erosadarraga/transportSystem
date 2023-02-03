package com.eros.transportSystem.repository;

public abstract class Person {
    private String namePerson;
    private int age ;

    public Person(String namePerson, int age) {
        this.namePerson = namePerson;
        this.age = age;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }
}
