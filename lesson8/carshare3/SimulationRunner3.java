import java.util.Scanner;

public class SimulationRunner3
{
    public static void main(String[] args)
    {
        Simulation3 sim = new Simulation3();
        sim.read(new Scanner(System.in));
        sim.loadPassengers();
        System.out.println(sim.toString());
    }
}
