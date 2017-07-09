package com.udacity.carShare;// BlueJ project: lesson8/carshare1
// To-do:
// implement tryToAdd()
import com.udacity.Person1;

import java.util.ArrayList;

public class Car1
{
    private ArrayList<Person1> passengers;
    private int numberOfSeats;
    private String driverName;
    private int location;
    private int destination;

    public Car1(String driverName, int numberOfSeats, int destination)
    {
        passengers = new ArrayList<Person1>();
        this.driverName = driverName;
        this.numberOfSeats = numberOfSeats;
        location = 0;
        this.destination = destination;
    }

    /**
       Gets the name of this car's driver.
       @return the driver name
    */
    public String getDriverName()
    {
        return driverName;
    }

    /**
       Checks whether this car has arrived at its destination.
       @return true if the car has arrived
    */
    public boolean hasArrived()
    {
        return location == destination;
    }

    /**
       Tries to add a passenger.
       @param p the new passenger
       @return true if there is room in the car and the passenger's
       destination on the way to this car's destination
    */
    public boolean tryToAdd(Person1 p)
    {
        if (destination >= p.getDestination() && passengers.size()+1 < numberOfSeats){
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }

    /**
       Drives this car to the next location and drops off
       any passengers whose destination is that location
    */
    public void drive()
    {
        // Leave blank for now
    }
}
