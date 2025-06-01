package ss7_abtract_class_va_interface.bai1;
import java.util.Random;
public class Main {
    public static void Main(String[]args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(7);

        Random random = new Random();

        for (Resizeable shape : shapes) {
            double percent = 1 + random.nextInt(100);
            double oldArea = 0;
            double newArea = 0;

            if (shape instanceof Circle) {
                Circle circle = new Circle()
            }
        }
    }
}
