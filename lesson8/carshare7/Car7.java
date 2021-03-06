// BlueJ project: lesson8/carshare7

import java.util.ArrayList;

public class Car7
{
    private ArrayList<Person7> passengers;
    private int numberOfSeats;
    private String driverName;
    private int location;
    private int destination;

    public Car7(String driverName, int numberOfSeats, int destination)
    {
        passengers = new ArrayList<Person7>();
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
    public boolean tryToAdd(Person7 p)
    {
        if (passengers.size() + 2 <= numberOfSeats
                && p.getDestination() <= destination)
        {
            passengers.add(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
       Drives this car to the next location and drops off
       any passengers whose destination is that location.
    */
    // TODO: Return a list of all passengers that get dropped off
    public ArrayList<Person7> drive()
    {
        ArrayList<Person7>droppedPassengers = new ArrayList<>();
        location++;
        int i = 0;
        while (i < passengers.size())
        {
            Person7 p = passengers.get(i);
            if (p.getDestination() == location)
            {
                droppedPassengers.add(passengers.remove(i));
            }
            else
            {
                i++;
            }
        }
        return droppedPassengers;
    }
}
