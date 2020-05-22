import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
    Shape shape1 = new Triangle( 3, 6, 7);
    Shape shape2 = new Circle(8);
    Shape shape3 = new Rectangle(6, 9);



    List<Shape> shapes = new ArrayList<>();
    shapes.add(shape1);
    shapes.add(shape2);
    shapes.add(shape3);


    for (Shape shape : shapes){
        shape.findPerimeter();;
        System.out.println("----------------");
    }
    }
}
