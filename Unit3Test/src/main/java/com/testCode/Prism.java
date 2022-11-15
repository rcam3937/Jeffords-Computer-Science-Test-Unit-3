package com.testCode;

public class Prism{

    private double length;
    private double height;
    private double width;

    public Prism()
    {
        length = 5;
        height = 12;
        width = 3;
    }

    public Prism(double userLength, double userHeight, double userWidth)
    {
        length = userLength;
        height = userHeight;
        width  = userWidth;
    }

    public double getLength()
    {
        return length;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public double getVolume()
    {
        return length * width * height;
    }
    public double getArea()
    {
        return 2*(length * width + width * height + length * height);
    }
    public boolean isEqual(Prism other)
    {
        // Change this!
        if (this.height  == other.height && this.length == other.length && this.width == other.width){
            return true;
        }
        else
        {
            return false;
        }
    }

}