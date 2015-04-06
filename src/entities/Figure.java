package entities;

import entities.enums.Color;
import entities.enums.Shapes;

public abstract class Figure {

    public Color color;
    public Shapes shape;

    // constructor with parameter from enums of the figures
    public Figure (Shapes shape){
        this.shape = shape;
    }

    // abstract method for calculates area of the figure
    public abstract double area ();

    // abstract method for draw the figure to the console
    public abstract void drawFigure ();

    // setter for set color of the figure
    public void setColor(Color color){
        this.color = color;
    }

    // getter for get color of the figure
    public Color getColorOfFigure (){
        return color;
    }

}
