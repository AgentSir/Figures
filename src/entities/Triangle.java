package entities;

import entities.enums.Color;
import entities.enums.Shapes;

import static java.lang.Math.*;

public class Triangle extends Figure {

    private double firstSide;
    private double secondSide;
    private double hypotenuse;
    private double areaOfTriangle;

    //Constructor with parameters for triangle
    public Triangle(double firstSide, double secondSide, Color color){
        super(Shapes.TRIANGLE);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    //Calculates hypotenuse of the triangle
    public double getHypotenuseLength(){
        hypotenuse = sqrt(pow(firstSide, 2) + pow(secondSide,2));
        return hypotenuse;
    }

    //Calculates area of the triangle
    public double area(){
        areaOfTriangle = (firstSide * secondSide)/2;
        return areaOfTriangle;
    }

    //draw figure to console
    @Override
    public void drawFigure() {
        System.out.print("Figure: " + shape + ", area: " + (int) area() + " square units, ");
        System.out.printf("hypotenuse of triangle: %.1f units, color: %s%n", getHypotenuseLength(), getColorOfFigure());
    }

}
