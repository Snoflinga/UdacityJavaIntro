package com.company;

/**
 * Created by pernilla on 2017-08-06.
 */
    // The Rectangle in the graphics package we have been using in
// this course is limited because it cannot calculate its area.
//
// Create a class UdacityRectagle that extends Rectangle and
// adds an area() method which returns an int
//
// This class will not need to provide any new instance variables,
// but it will need a constructor which takes x, y coordinates and
// width and height. Write this in the space indicated below.
//
// A RectangleDemo class is included on a different tab. This may give you some hints.

    public class UdacityRectangle extends Rectangle  //...something goes here
    {
        public UdacityRectangle(double x, double y, double width, double height){
            super(x, y, width, height);
        }

        public int area(){
            double width = getWidth();
            double height = getHeight();
            int area = (int) (width * height);
            return area;
        }


        // Write your code for the constructor and the area() method here.

    }

