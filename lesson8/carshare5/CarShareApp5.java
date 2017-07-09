// To-do:
// Run the main method to find out the order
// in which passengers get dropped off.
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp5
{
    public static void main(String[] args) throws IOException
    {
        Simulation5 sim = new Simulation5();
        sim.read(new Scanner(new File("carshare5/input.txt")));
        sim.loadPassengers();
        sim.driveCars();
    }
}
