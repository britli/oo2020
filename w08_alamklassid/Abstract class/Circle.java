/**
 * Circle
 */
public class Circle extends Shape{
    private int r;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public void findPerimeter() {
        int perimeter = (int) (Math.PI * 2 * r);
        System.out.println("Kolnurga ümbermõõt on " + perimeter);

    }
    
}