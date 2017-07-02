// BlueJ project: lesson8/counting

// TODO: Provide an instance variable for counting the passengers.
// TODO: Complete the addPassenger and getPassengerCount methods.

public class Car11
{
    private int numberOfSeats;
    private int passengers;

    /**
        Constructs a car with a given number of seats
        @param numberOfSeats the number of seats in this car.
    */
    public Car11(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
        this.passengers = 0;
    }


    /**
       Adds a passenger to this car, provided that there is space.
    */
    public void addPassenger()
    {
        if (passengers < numberOfSeats -1){
        this.passengers += 1;
        }
    }

    /**
       Gets the number of passengers in this car (not counting the driver).
       @return the number of passengers
    */
    public int getPassengerCount()
    {
        return passengers;
    }
}

