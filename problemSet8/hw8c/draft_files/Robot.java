// Implement a class Robot that simulates a robot wandering randomly on an infinite plane. The robot
// is located at a point with integer coordinates. It initially faces "North" - the top of the window.

//Supply a constructor that specifies the initial x, y coordinates of the robot as ints.

//Supply methods:
//public void makeRandomMove()
//public Point getLocation()
//public double getDistanceFromStart()

//The makeRandomMove method moves the robot by one unit in a random direction.
// To choose the random direction, generate an int from 0 to 3. 
//  0 is toward the top of the window (north)
//  1 is towards the bottom of the window (south)
//  2 is towards the right side of the window (east)
//  3 is towards the left side of the window (west)

// getLocation() returns a java.awt.Point containing the current x and y location of the Robot

// getDistanceFromStart() returns the distance the robot is from the starting point.

// This problem is an example of describing the design pattern, position of an object.

//You would expect that if the robot is moving randomly that he would wind up very close to where he started,
//but that is not true. It would take more of a mathematician than I am to explain why. But it is interesting.
//You can comment out the generator.setSeed(...) statement and see lots of different outcomes. But do not
//forget to put the statement back in. When you "seed" a random number generator with a starting value,
//it will give the same sequence of values every time. That is what makes it possible to test your
//programs. If we both start with the same seed in the random number generator, we should get the same
//answes.

//For the draft, define the instance variables, then finish the constructor and supply the getLocation.

/**
 * Simulates a robot wandering randomly on an infinite plane
 *
 */
import java.awt.Point;
import java.util.Random;

public class Robot
{
    private int x;
    private int y;
    private double distanceFromStart;
    private Point startPos;

    private Random generator;

    /**
     * Constructor for objects of class Robot
     * @param theX the x coordinate
     * @param theY the y coordinate
     */
    public Robot(int theX, int theY)
    {
        this.x = theX;
        this.y = theY;
        this.distanceFromStart = 0.0;
        this.startPos = new Point(theX, theY);

        generator = new Random();
        generator.setSeed(12345);  //do not change this statement
    }

    /**
     * Get location for the robot currently position.
     * @return x and y coordinates
     */
// TODO Supply getLocation
    public Point getLocation()
    {
        Point point = new Point(this.x, this.y);
        return point;
    }

    /**
     * Robot moves by one unit in a random direction.
     */
    public void makeRandomMove(){
        int move = generator.nextInt(4); // To choose the random direction, generate an int from 0 to 3.
        switch (move){
            case 0:{ //  0 is toward the top of the window (north)
                this.y -= 1;
                break;
            }
            case 1:{ //  1 is towards the bottom of the window (south)
                this.y += 1;
                break;
            }
            case 2:{ //  2 is towards the right side of the window (east)
                this.x += 1;
                break;
            }
            case 3:{ //  3 is towards the left side of the window (west)
                this.x -= 1;
                break;
            }
            default: {
                System.out.println("Error: robot hasn't move.");
                break;
            }
        }
    }

    public double getDistanceFromStart(){
        Point goalPos = getLocation();
        distanceFromStart += Math.sqrt((((goalPos.getX() - startPos.getX()) * (goalPos.getX() - startPos.getX()))
                +((goalPos.getY() - startPos.getY())*(goalPos.getY() - startPos.getY()))));
        return distanceFromStart;
    }



}
