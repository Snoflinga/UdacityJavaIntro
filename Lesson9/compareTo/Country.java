// Implement compareTo
/**
   A country with a name and area.
*/
public class Country implements Measurable, Comparable
{
    private String name;
    private double area;

    /**
       Constructs a country.
       @param aName the name of the country
       @param anArea the area of the country
    */
    public Country(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    public int compareTo(Object otherObject)
    {
        Country otherCountry = (Country) otherObject;
        if (this.equals(otherCountry))
        {
            return 0;
        }
        else if (this.area < otherCountry.area)
        {
            return -1;
        }
        else if (this.area > otherCountry.area)
        {
            return 1;
        }
        else
        {
            return this.name.compareTo(otherCountry.name);
        }

        // TODO YOUR CODE HERE
        // Implement this method.
        // Countries should be ordered from smallest area to largest.
        // Return a negative number if this country is smaller than other.
        // Return a positive number if this country is larger than other.
        // Return 0 if the two countries are equal. Use .equals.
        // I implemented .equals for you.
        // If the countries are exactly the same size, break ties
        // using the name of the country.
    }

    /**
       Gets the country name.
       @return the name
    */
    public String getName()
    {
        return name;
    }

    /**
       Gets the area of the country.
       @return the area
    */
    public double getArea()
    {
        return area;
    }

    /**
       Gets the area of the country.
       @return the area
    */
    public double getMeasure()
    {
        return area;
    }

    public boolean equals(Object other)
    {
        if (other instanceof Country)
        {
            Country country = (Country) other;
            return this.name.equals(country.name)
                   && this.area == country.area;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Country[name=" + name + " area=" + area + "]\n";
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     * <p>
     * <p>The implementor must ensure <tt>sgn(x.compareTo(y)) ==
     * -sgn(y.compareTo(x))</tt> for all <tt>x</tt> and <tt>y</tt>.  (This
     * implies that <tt>x.compareTo(y)</tt> must throw an exception iff
     * <tt>y.compareTo(x)</tt> throws an exception.)
     * <p>
     * <p>The implementor must also ensure that the relation is transitive:
     * <tt>(x.compareTo(y)&gt;0 &amp;&amp; y.compareTo(z)&gt;0)</tt> implies
     * <tt>x.compareTo(z)&gt;0</tt>.
     * <p>
     * <p>Finally, the implementor must ensure that <tt>x.compareTo(y)==0</tt>
     * implies that <tt>sgn(x.compareTo(z)) == sgn(y.compareTo(z))</tt>, for
     * all <tt>z</tt>.
     * <p>
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * <tt>(x.compareTo(y)==0) == (x.equals(y))</tt>.  Generally speaking, any
     * class that implements the <tt>Comparable</tt> interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     * <p>
     * <p>In the foregoing description, the notation
     * <tt>sgn(</tt><i>expression</i><tt>)</tt> designates the mathematical
     * <i>signum</i> function, which is defined to return one of <tt>-1</tt>,
     * <tt>0</tt>, or <tt>1</tt> according to whether the value of
     * <i>expression</i> is negative, zero or positive.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
   /* @Override
    public int compareTo(Object o) {
        Country otherCountry = (Country) o;
        if (this.equals(otherCountry)){
            return 0;
        }
        return 0;*/
   // }
}
