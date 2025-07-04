package ss6_ke_thua.bai1;

import ss6_ke_thua.bai1.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
