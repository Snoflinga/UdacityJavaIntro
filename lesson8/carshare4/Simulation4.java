// BlueJ project: lesson8/carshare4
// To-do: 
// Implement the driveCars method.
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation4
{
    private ArrayList<Car4> cars;
    private ArrayList<Person4> people;

    public Simulation4()
    {
        cars = new ArrayList<Car4>();
        people = new ArrayList<Person4>();
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
                    people.add(new Person4(name, destination));
                }
                else
                {
                    cars.add(new Car4(name, capacity, destination));
                }
            }
        }
    }

    /**
       Load all passengers into cars.
    */
    public void loadPassengers()
    {
        for (Person4 p : people)
        {
            boolean added = false;
            for (int i = 0; !added && i < cars.size(); i++)
            {
                added = cars.get(i).tryToAdd(p);
            }
        }
    }

    /**
       Drive all cars until they have arrived.
    */
    public void driveCars()
    {
        // Complete this method
    }

    public String toString()
    {
        return cars.toString();
    }
}
