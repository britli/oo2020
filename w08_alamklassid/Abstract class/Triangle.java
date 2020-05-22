public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;
    
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void findPerimeter(){
        int perimeter = a + b + c;
        System.out.println("Kolnurga ümbermõõt on " + perimeter);
    }
}