//Complete the  method getLength() which takes a Comparable object as its parameter.
// If parameter references a String object, return the length of the String
//otherwise return -1.
public class DataMethods
{
    /**
     * Gets the length of the object if it is a string
     * @param object the object we hose length we want
     * @return the length if the object is a string otherwise -1
     */

    public int getLength(Comparable object){

        try {
            String s = (String) object;
            return s.length();

        } catch (ClassCastException e){
        return - 1;
        }

    }
      // TODO: implement the method described by this javadoc
}
