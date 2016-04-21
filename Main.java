package dz.module2;

/**
 * Created by Володимир on 19.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setHigh(5);
        triangle.setOsnova(10);
        System.out.println("Square of Triangle is " + triangle.getSquare());

        Rectangle rectangle = new Rectangle();
        rectangle.setHigh(45);
        rectangle.setOsnova(10);
        System.out.println("Square of Rectangle is " + rectangle.getSquare());

        Circle circle = new Circle();
        circle.setRadius(15);
        System.out.println("Square of Circle is " + circle.getSquare());
    }
}
