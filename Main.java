import java.util.*;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape star = new Star();
        Shape hexagon = new Hexagon();
        Shape line = new Line();
        Shape thriangle = new Thriangle();
        System.out.println("Exellent shape is: "+circle.getShapeName());
        System.out.println("Exellent shape is: "+quad.getShapeName());
        System.out.println("Exellent shape is: "+star.getShapeName());
        System.out.println("Exellent shape is: "+hexagon.getShapeName());
        System.out.println("Exellent shape is: "+line.getShapeName());
        System.out.println("Exellent shape is: "+thriangle.getShapeName());
    }
}
abstract class Shape{
    public abstract  String getShapeName();
}
class Circle extends Shape{
    @Override
    public String getShapeName() {
        return "Circle";
    }
    double x1;
    double x2;
    int radius;
}
class Quad extends Shape{
    @Override
    public String getShapeName() {
        return "Quad";
    }
    double x1;
    double x2;
    double y1;
    double y2;
}
class Star extends Shape{
    @Override
    public String getShapeName() {
        return "Star";
    }
    private double[] point1 = new double[2];
    private double[] point2 = new double[2];
    private double[] point3 = new double[2];
    private double[] point4 = new double[2];
    private double[] point5 = new double[2];

}
class Hexagon extends Shape{
    @Override
    public String getShapeName() {
        return "Hexagon";
    }
    private double[] point1 = new double[2];
    private double[] point2 = new double[2];
    private double[] point3 = new double[2];
    private double[] point4 = new double[2];
    private double[] point5 = new double[2];
    private double[] point6 = new double[2];
}
class Line extends Shape{
    @Override
    public String getShapeName() {
        return "Line";
    }
    private double[] firstPoint = new double[2];
    private double[] lastPoint = new double[2];
}
class Thriangle extends Shape{
    @Override
    public String getShapeName() {
        return "Thriangle";
    }
    private double[] point1 = new double[2];
    private double[] point2 = new double[2];
    private double[] point3 = new double[2];
}