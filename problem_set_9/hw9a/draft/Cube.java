// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;

    public Cube(double s)
    {
        side = s;
    }

    @Override
    public double getVolume() {
        double volume = Math.pow(this.side, 3);
        return volume;
    }

    @Override
    public double getSurfaceArea() {
        double area = 6 * Math.pow(this.side, 2);
        return area;
    }
}
