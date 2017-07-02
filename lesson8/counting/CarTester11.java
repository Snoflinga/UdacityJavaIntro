public class CarTester11
{
    public static void main(String[] args)
    {
        Car11 twoSeater = new Car11(2);
        twoSeater.addPassenger();
        System.out.println(twoSeater.getPassengerCount());
        System.out.println("Expected: 1");
        twoSeater.addPassenger();
        System.out.println(twoSeater.getPassengerCount());
        System.out.println("Expected: 1");
        Car11 fourSeater = new Car11(4);
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 1");
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 2");
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 3");
        fourSeater.addPassenger();
        System.out.println(fourSeater.getPassengerCount());
        System.out.println("Expected: 3");
    }
}
