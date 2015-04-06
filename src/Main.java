import entities.Figure;
import entities.enums.Shapes;

import java.util.LinkedList;
import java.util.Random;

      /** Дано объекты-фигуры следующих видов: квадрат, треугольник, круг, трапеция.
      *  Каждую фигуру можно нарисовать, получить ее площадь и цвет.
      *  Также фигуры имеют уникальные методы, например: вернуть радиус, длину гипотенузы, длину стороны и т. д.
      *  Нам необходимо сгенерировать случайный набор фигур, количество объектов в наборе также заранее неизвестно.
      *  После генерации массива нужно вывести весь список объектов, которые у нас имеются, например:
      *  Фигура: квадрат, площадь: 25 кв. ед., длина стороны: 5 ед., цвет: синий
      *  Фигура: треугольник, площадь: 12,5 кв.ед., гипотенуза: 7.1 ед., цвет: желтый
      */

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        LinkedList<Figure> linkedList = new LinkedList<Figure>();
        Shapes [] shapes = Shapes.values();

        //generate figure and write one to array
        for (int i = 0; i < random.nextInt(20) + 1; i ++){
            linkedList.add(GenerateFigure.generateFigure(shapes[random.nextInt(4)]));
        }

        // draw all figure to console
        for (Figure x : linkedList){
            x.drawFigure();
        }

    }

}

