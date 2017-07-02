public class CarTester2
{
    public static void main(String[] args)
    {
        Car2 car1 = new Car2("Fred", 4, 2);
        car1.tryToAdd(new Person2("Joanne", 1));
        car1.tryToAdd(new Person2("Jose", 2));
        car1.tryToAdd(new Person2("Carl", 1));
        System.out.println(car1);
        System.out.println("Expected: Car2[location=0,driverName=Fred,passengers=[Joanne, Jose, Carl]]");
        car1.drive();
        System.out.println(car1);
        System.out.println("Expected: Car2[location=1,driverName=Fred,passengers=[Jose]]");
        car1.drive();
        System.out.println(car1);
        System.out.println("Expected: Car2[location=2,driverName=Fred,passengers=[]]");
    }
}
