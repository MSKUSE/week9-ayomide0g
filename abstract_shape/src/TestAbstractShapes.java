import java.awt.*;

import java.util.ArrayList;
public class TestAbstractShape {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3,4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(3,4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        Shape square = new Rectangle(3,4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(rectangle);
        shapes.add(rectangle);
        shapes.add(square);

        for(int i =0 ; i<3;i++){
            System.out.println(shapes.get(i));
        }
    }