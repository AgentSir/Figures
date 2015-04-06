import entities.*;
import entities.enums.Color;
import entities.enums.Shapes;

import java.util.Random;

public class GenerateFigure {

    // realization the factory design pattern
    public static Figure generateFigure(Shapes shape){
        Figure figure = null;

        switch (shape){
            case TRIANGLE:
                figure = new Triangle(getRandomLineLengthInDouble(), getRandomLineLengthInDouble(), getRandomColor());
                break;
            case SQUARE:
                figure = new Square(getRandomLineLengthInInt(), getRandomColor());
                break;
            case ISOSCELES_TRAPEZE:
                figure = new IsoscelesTrapeze(getRandomLineLengthInDouble(), getRandomLineLengthInDouble(), getRandomLineLengthInDouble(), getRandomColor());
                break;
            case CIRCLE:
                figure = new Circle(getRandomLineLengthInInt(), getRandomColor());
                break;
            default:
                throw new IllegalArgumentException();
        }
        return figure;

    }

    private static double getRandomLineLengthInDouble() {
        Random random = new Random();
        return (double) random.nextInt(50) + 1;
    }

    private static int getRandomLineLengthInInt() {
        Random random = new Random();
        return random.nextInt(50) + 1;
    }

    private static Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return colors[random.nextInt(4)];
    }

}
