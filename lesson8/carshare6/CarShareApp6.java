import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp6
{
    public static void main(String[] args)
    {
        Simulation6 sim = new Simulation6();
        sim.read(new Scanner(System.in));
        sim.loadPassengers();
        sim.driveCars();
    }
}
