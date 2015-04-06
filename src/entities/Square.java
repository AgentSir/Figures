package entities;

import entities.enums.Color;
import entities.enums.Shapes;

import static java.lang.Math.*;

public class Square extends Figure {

    private int side;
    private double areaOfSquare;

    //Constructor with parameters for square
    public Square (int side, Color color){
        super(Shapes.SQUARE);
        this.setColor(color);
        this.side = side;
    }

    //method for return the side value of the square
    public int getSideLength() {
        return side;
    }

    //Calculates area for square
    public double area (){
        areaOfSquare = pow (side, 2);
        return areaOfSquare;
    }

    //draw figure to console
    @Override
    public void drawFigure() {
        System.out.print("Figure: " + shape + ", area: " + (int) area() + " square units");
        System.out.printf(", side of square: %d units, color: %s%n", getSideLength(), getColorOfFigure());
    }

}
