// BlueJ project: lesson9/measure1
public class Data
{
    /**
       Computes the average area of the given countries.
       @param objects an array of Country objects
       @return the average of the areas
    */
    public static double average(Country[] objects)
    {
        // TODO: Compute the average area
        double sum = 0;
        double numOfCountries = 0;
        double average = 0;
        for (Country obj : objects)
        {
            sum += obj.getArea();
            numOfCountries += 1;
        }
        average = sum/numOfCountries;
        return average;
    }
}
