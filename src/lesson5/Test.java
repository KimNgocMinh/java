package lesson5;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width and height: ");
        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
        rectangle.printPerimeter();
        rectangle.printArea();
        rectangle.checkRectangle();
    }
}
class Rectangle{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public void setHeight(double a){
        height = a;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double b){
       width = b;
    }
    public double getWidth(){
        return width;
    }
    public double getPerimeter(){
        return (width + height) * 2;
    }
    public double getArea(){
        return width * height;
    }
    public void printWidth(){
        System.out.println(width);
    }
    public void printHeight(){
        System.out.println(height);
    }
    public void printPerimeter(){
        System.out.println("Perimeter is: " + getPerimeter());
    }
    public void printArea(){
        System.out.println("Area is: " + getArea());
    }
    public void checkRectangle(){
        if (width == height)
            System.out.print("With width is " + getWidth() + " and height is " + getHeight() + " .It is square");
        else
            System.out.print("With width is " + getWidth() + " and height is " + getHeight() + " .It is rectangle");
    }
}
    


