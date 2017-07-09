import java.util.ArrayList;

public class Car5
{
    private ArrayList<Person5> passengers;
    private int numberOfSeats;
    private String driverName;
    private int location;
    private int destination;

    public Car5(String driverName, int numberOfSeats, int destination)
    {
        passengers = new ArrayList<Person5>();
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
    public boolean tryToAdd(Person5 p)
    {
        if (passengers.size() + 2 <= numberOfSeats
                && p.getDestination() <= destination)
        {
            passengers.add(p);
            System.out.println(driverName
                               + " picks up " + p.getName());
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
       Drives this car to the next location and drops off
       any passengers whose destination is that location
    */
    public void drive()
    {
        location++;
        int i = 0;
        while (i < passengers.size())
        {
            Person5 p = passengers.get(i);
            if (p.getDestination() == location)
            {
                passengers.remove(i);
                System.out.println(driverName
                                   + " drops off " + p.getName());
            }
            else
            {
                i++;
            }
        }
    }
}