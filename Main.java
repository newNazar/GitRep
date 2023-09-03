import java.util.*;

public class Main {
    public static void main(String[] args) {
        ShapeNamePrinter printer = new ShapeNamePrinter();
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape star = new Star();
        Shape hexagon = new Hexagon();
        Shape line = new Line();
        Shape triangle = new Thriangle();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number shape: \n1. Circle\n2. Quad\n" +
                "3. Star\n4. Hexagon\n5. Line\n6. Triangle\n");
        int num = in.nextInt();

        if (num < 1 || num > 6) {
            System.out.println("Invalid number!");
        } else if (num == 1) {
            printer.printShapeName(circle);
            circle.example();
        } else if (num == 2) {
            printer.printShapeName(quad);
            quad.example();
        } else if (num == 3) {
            printer.printShapeName(star);
            star.example();
        } else if (num == 4) {
            printer.printShapeName(hexagon);
            hexagon.example();
        } else if (num == 5) {

            line.example();
        } else if (num == 6) {
            printer.printShapeName(triangle);
            triangle.example();
        }
        in.close();
    }
}
class ShapeNamePrinter {
    public void printShapeName(Shape shape) {
        String shapeName = shape.getName();
        System.out.println("The name of the shape is: " + shapeName);
    }
}
abstract class Shape{
    public abstract String getName();
    //public abstract String toString();

    public abstract void example();
}
class Circle extends Shape{
    @Override
    public String getName() {
        return "Circle";
    }
   @Override
    public void example(){
        System.out.println("For example:");
        int r = 4;
        int cX = 5;
        int cY = 5;
        // Проходим по координатам и выводим символ '*' для точек внутри круга
        for (int y = cY - r; y <= cY + r; y++) {
            for (int x = cX - r; x <= cX + r; x++) {
                //формула окружности (x-a)^2 + (y-b)^2 <= r^2
                int distance = (x - cX) * (x - cX) + (y - cY) * (y - cY);
                if (distance <= r * r) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}

class Quad extends Shape{
    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public void example(){
    System.out.println("For example:");
        int size = 7;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print('*');
                } else {
                    // Внутренняя часть квадрата
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}

class Star extends Shape{
    @Override
    public String getName() {
        return "Star";
    }

    @Override
    public void example(){
        System.out.println("For example:");
        int size = 7;
        int cX = size / 2;
        int cY = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == cX || j == cY || i + j == cX + cY || i - j == cX - cY || j - i == cY - cX) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}

class Hexagon extends Shape {
    @Override
    public String getName() {
        return "Hexagon";
    }


    @Override
    public void example() {
        System.out.println("For example:");
        int size = 5;
        for (int i = 0; i < size; i++) {
            //пробелы для отступа слева
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            //'*' для верхней части шестиугольника
            for (int k = 0; k < 2 * i + size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size - 2; i >= 0; i--) {
            //пробелы для отступа слева
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }

            //'*' для нижней части шестиугольника
            for (int k = 0; k < 2 * i + size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Line extends Shape{
    @Override
    public String getName() {
        return "Line";
    }

    @Override
    public void example(){
        System.out.println("For example:");
        int length = 10;
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
class Thriangle extends Shape {
    @Override
    public String getName() {
        return "Thriangle";
    }

    @Override
    public void example(){
        System.out.println("For example:");
        int height = 7;
        for (int i = 1; i <= height; i++) {
            //пробелы для отступа слева
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            //'*' для текущей строки
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}