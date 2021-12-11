package bai_2;

public class Circle implements IShape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
}
