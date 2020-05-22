public class Rectangle extends Shape{
    private int a;
    private int b;


    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
        
    }

    @Override
    public void findPerimeter() {
        int perimeter = 2*(a + b) ;
        System.out.println("Ristküliku ümbermõõt on " + perimeter);

    }
}
