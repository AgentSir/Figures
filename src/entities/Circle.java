package entities;

import entities.enums.Color;
import entities.enums.Shapes;

import static java.lang.Math.*;

public class Circle extends Figure {

    private int radius;
    private double areaOfRound;

    //constructor with parameters for circle
    public Circle (int radius, Color color){
        super(Shapes.CIRCLE);
        this.setColor(color);
        this.radius = radius;
    }

    //method for return the radius value of the circle
    public int getRadius (){
        return radius;
    }

    //Calculates area for circle
    public double area (){
        areaOfRound = PI * pow(radius, 2);
        return areaOfRound;
    }

    //draw figure to console
    @Override
    public void drawFigure() {
        System.out.printf("Figure: %s, area: %.1f square units", shape, area());
        System.out.printf(", radius of circle: %d units, color: %s%n", getRadius(), getColorOfFigure());
    }

}
