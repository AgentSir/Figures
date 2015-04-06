package entities;

import entities.enums.Color;
import entities.Figure;
import entities.enums.Shapes;

import static java.lang.Math.*;

public class IsoscelesTrapeze extends Figure {

    private double height;
    private double alpha;
    private double downBaseOfTrapeze;
    private double edgeOfTrapeze;
    private double upBaseOfTrapeze;
    private double areaOfIsoscelesTrapeze;

    //constructor with parameters for isosceles trapeze
    public IsoscelesTrapeze (double height, double alpha, double downBaseOfTrapeze, Color color){
        super(Shapes.ISOSCELES_TRAPEZE);
        this.setColor(color);
        this.height = height;
        this.downBaseOfTrapeze = downBaseOfTrapeze;
        this.alpha = alpha;
        edgeOfTrapeze = this.height/(sin(this.alpha));
        upBaseOfTrapeze = this.downBaseOfTrapeze - (2 * edgeOfTrapeze * cos(this.alpha));
    }

    //Calculate the diagonal value of the isosceles trapeze
    public double getDiagonalOfTrapezoid (){
        return sqrt((edgeOfTrapeze * edgeOfTrapeze) + (upBaseOfTrapeze * downBaseOfTrapeze));
    }

    //Calculates area for isosceles trapeze
    public double area (){
        areaOfIsoscelesTrapeze = edgeOfTrapeze * sin(alpha) * (downBaseOfTrapeze - (edgeOfTrapeze * cos(alpha)));
        return areaOfIsoscelesTrapeze;
    }

    //draw figure to console
    @Override
    public void drawFigure() {
        System.out.printf("Figure: %s, area: %.1f  square units", shape, area());
        System.out.printf(", diagonal of hypotenuse: %.1f units, color: %s%n", getDiagonalOfTrapezoid(), getColorOfFigure());
    }

}
