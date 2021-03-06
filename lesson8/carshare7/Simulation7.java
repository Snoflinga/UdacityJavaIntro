// BlueJ project: lesson8/carshare7

import java.util.ArrayList;
import java.util.Scanner;

public class Simulation7
{
    private ArrayList<Car7> cars;
    private ArrayList<Person7> people;

    public Simulation7()
    {
        cars = new ArrayList<Car7>();
        people = new ArrayList<Person7>();
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
                    people.add(new Person7(name, destination));
                }
                else
                {
                    cars.add(new Car7(name, capacity, destination));
                }
            }
        }
    }

    /**
       Load all passengers into cars.
    */
    public void loadPassengers()
    {
        for (Person7 p : people)
        {
            boolean added = false;
            for (int i = 0; !added && i < cars.size(); i++)
            {
                added = cars.get(i).tryToAdd(p);
                if (added)
                {
                    System.out.println(cars.get(i).getDriverName()
                                       + " picks up " + p.getName());
                }
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
                Car7 c = cars.get(i);
               // ArrayList<Person7> droppedPersons = c.drive();
                // TODO: Add print statement here
                for (Person7 p : c.drive()) {
                System.out.println(cars.get(i).getDriverName()
                        + " drops off " + p.getName());
                }
                if (c.hasArrived())
                {
                    cars.remove(i);
                } else {
                    i++;
                }
            }
        }
    }
}
