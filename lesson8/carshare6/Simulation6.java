// BlueJ project: lesson8/carshare6

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation6
{
    private ArrayList<Car6> cars;
    private ArrayList<Person6> people;

    public Simulation6()
    {
        cars = new ArrayList<Car6>();
        people = new ArrayList<Person6>();
    }

    /**
       Reads the car and person data. Each row has the format
       n    Driver or Passenger Name   Destination
       where n is the number of seats for a car,
       0 for a passenger, -1 to signify the end of input.
       @param in the scanner to read from
    */
    public void read(Scanner in)
    {
        boolean done = false;
        System.out.println("Enter input of the form n Name Destination");
        System.out.println("n > 0: Car with n seats, n = 0: Passenger, n = -1: End of input");
        while (!done)
        {
            int capacity = in.nextInt();
            if (capacity == -1)
            {
                done = true;
            }
            else
            {
                String name = in.next();
                int destination = in.nextInt();
                if (capacity == 0)
                {
                    people.add(new Person6(name, destination));
                }
                else
                {
                    cars.add(new Car6(name, capacity, destination));
                }
            }
        }
    }

    /**
       Load all passengers into cars.
    */
    public void loadPassengers()
    {
        for (Person6 p : people)
        {
            boolean added = false;
            for (int i = 0; !added && i < cars.size(); i++)
            {
                added = cars.get(i).tryToAdd(p);
                // TODO: Add print statement here
            }
        }
    }

    /**
       Drive all cars until they have arrived.
    */
    public void driveCars()
    {
        while (cars.size() > 0)
        {
            int i = 0;
            while (i < cars.size())
            {
                Car6 c = cars.get(i);
                c.drive();
                if (c.hasArrived())
                {
                    cars.remove(i);
                }
                else
                {
                    i++;
                }
            }
        }
    }
}
