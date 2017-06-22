import java.util.ArrayList;
public class ArrayMethodsTester
{
    public static void main(String[] args)
    {
        //set up
        String[] animal = {"ape", "dog", "zebra"};
        ArrayMethods zooz = new ArrayMethods(animal);

        //test isSorted
        System.out.println(zooz.isSorted());
        System.out.println("Expected: true");

        String[] animal2 = {"ape", "dog", "zebra", "cat"};
        zooz = new ArrayMethods(animal2);
        System.out.println(zooz.isSorted());
        System.out.println("Expected: false");

        String[] animal3 = {"cat", "ape", "dog", "zebra"};
        zooz = new ArrayMethods(animal3); ;
        System.out.println(zooz.isSorted());
        System.out.println("Expected: false");


        //set up
        String[] animals = {"cat", "ape", "dog", "horse", "zebra"};
        ArrayMethods zoo = new ArrayMethods(animals);

        //test replaceWithLargerNeighbor
        zoo.replaceWithLargerNeighbor();
        System.out.println(zoo.toString());
        System.out.println("Expected: [cat, dog, horse, zebra, zebra]");

        //test count duplicates;
        String[] animals2 = {"cat", "cat", "dog", "horse", "zebra", "zebra"};
        zoo = new ArrayMethods(animals2);
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 2");

        String[] animals3 = {"dog", "cat", "cat", "dog", "horse", "zebra", "zebra"};
        zoo = new ArrayMethods(animals3);
        System.out.println(zoo.countDuplicates());
        System.out.println("Expected: 3");

        String[] animals4 = {"ape", "dog", "xantus",  "zebra", "cat", "yak"};
        zoo = new ArrayMethods(animals4);
        zoo.xyzToFront();
        System.out.println("Original order: ape, dog, xantus, zebra, cat, yak");
        System.out.println(zoo.toString());
        System.out.println("Expected: [xantus, zebra, yak, ape, dog, cat]");

    }
}
