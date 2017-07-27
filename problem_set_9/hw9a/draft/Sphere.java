// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// TODO: complete the code so that Shpere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Sphere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    @Override
    public double getVolume() {
        double volume = (4.0/3.0) * Math.PI * Math.pow(getRadius(),3);
        return volume;
    }

    @Override
    public double getSurfaceArea() {
        double area = 4.0 * Math.PI * Math.pow(getRadius(), 2);
        return area;
    }
}
