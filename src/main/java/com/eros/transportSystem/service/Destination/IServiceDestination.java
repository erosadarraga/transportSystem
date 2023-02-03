package com.eros.transportSystem.service.Destination;

import com.eros.transportSystem.repository.Destination;

import java.util.List;

public interface IServiceDestination {

    public List<Destination> getAllDestination();
    public Destination PostDestination(Destination destination);
    public void DeleteDestination(int id);

}
