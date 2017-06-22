
//
// Complete the methods below. These methods manipulate Arrays of Strings
// For the draft, complete the first method
//

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        for (int i = 0; i < this.list.length -1; i += 1){
            String firstWord = list[i];
            String secondWord = list[i+1];
            if (firstWord.compareTo(secondWord) > 0 ){
                sorted = false;
            }
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {
        String[]tmpArray = Arrays.copyOf(list, list.length);
        for (int i = 1; i < list.length -1; i +=1){
            String firstWord = list[i];
            String secondWord = list[i+1];

            if (firstWord.compareTo(secondWord) < 0){
                tmpArray[i] = secondWord;
            }
        }
        this.list = tmpArray;

    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates() {
        Map<String, Integer> repetitionMap = new HashMap<>();
        for (String str : this.list) {

            if (repetitionMap.containsKey(str)) {
                repetitionMap.put(str, repetitionMap.get(str) + 1);
            } else {
                repetitionMap.put(str, 1);
            }
        }
        int duplicates = 0;
        for (int repeatCount : repetitionMap.values()) {
            if (repeatCount > 1) {
                duplicates++;
            }
        }
        return duplicates;
    }


    /*{
        int duplicates = 0;
        boolean foundDuplicate = false;
        for (int i = 0; i < list.length - 1; i += 1){
            for (int y = i + 1; y < list.length -1; y += 1){
                int firstPos = i;
                int secondPos = y;
                String firstWord = list[firstPos];
                String secondWord = list[secondPos];
                if (firstWord.compareTo(secondWord) == 0){
                   foundDuplicate = true;
                }
            }
            if (foundDuplicate) {
                duplicates += 1;
            }
        }*/

    /**
     * Moves any word that starts with x, y, or z to the front of the arraylist, but
     * otherwise preserves the order
     */
    public void xyzToFront() {
        int insertAt = 0;
        String[] tmpArray = Arrays.copyOf(list, list.length);
        for (int i = 1; i < list.length; i += 1) {
            String word = tmpArray[i];
            String firstLetter = word.substring(0, 1).toLowerCase();

            if (firstLetter.equals("x") || firstLetter.equals("y") || firstLetter.equals("z")) {
                for (int y = i; y > insertAt; y -= 1){
                    int posMoveFrom = y-1;
                    int posMoveTo = y;
                    tmpArray[posMoveTo]= tmpArray[posMoveFrom];
                }
                tmpArray[insertAt] = word;
                insertAt += 1;
            }
        }
        this.list = tmpArray;
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        String arrayString = "[";
        for (String s: this.list) {
            arrayString = arrayString + s + ", ";
        }
        arrayString = arrayString.substring(0, arrayString.length()- 2) + "]";
        return arrayString;
    }
}