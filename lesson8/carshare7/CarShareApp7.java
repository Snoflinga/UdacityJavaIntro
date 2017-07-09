import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp7
{
    public static void main(String[] args) throws IOException
    {
        Simulation7 sim = new Simulation7();
        sim.read(new Scanner(new File("carshare7/input.txt")));
        sim.loadPassengers();
        sim.driveCars();
    }
}
