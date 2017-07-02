public class CarTester1
{
    public static void main(String[] args)
    {
        Car1 car1 = new Car1("Fred", 4, 2);
        Person1 person1 = new Person1("Joanne", 1);
        boolean result = car1.tryToAdd(person1);
        System.out.println("Trying to add Joanne going to destination 1: " + result);
        System.out.println("Expected: true");
        Person1 person2 = new Person1("Cindy", 3);
        result = car1.tryToAdd(person2);
        System.out.println("Trying to add Cindy going to destination 3: " + result);
        System.out.println("Expected: false");
        car1.tryToAdd(new Person1("Carl", 1));
        result = car1.tryToAdd(new Person1("Jose", 2));
        System.out.println("Trying to add Jose going to destination 2: " + result);
        System.out.println("Expected: true");
        result = car1.tryToAdd(new Person1("Voldemort", 1));
        System.out.println("Trying to add a passenger to a full car: " + result);
        System.out.println("Expected: false");
    }
}
