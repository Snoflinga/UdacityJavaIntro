import java.util.Scanner;

public class SimulationRunner4
{
    public static void main(String[] args)
    {
        Simulation4 sim = new Simulation4();
        sim.read(new Scanner(System.in));
        sim.loadPassengers();
        sim.driveCars();
    }
}
