package ss6_ke_thua;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(2.5, "blue", 10.0);
        System.out.println(cylinder.toString());
    }
}
