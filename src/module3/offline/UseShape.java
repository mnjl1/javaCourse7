package module3.offline;

/**
 * Created by citsym on 11.05.17.
 */
public class UseShape {

    public static void main(String[] args) {

        Shape circle1 = new Circle(4);
        Shape circle2 = new Circle(2);
        Shape circle3 = new Circle(5);

        Shape rectangle1 = new Rectangle(2, 6);
        Shape rectangle2 = new Rectangle(1, 8);
        Shape rectangle3 = new Rectangle(20, 5);

        Shape square1 = new Square(5);
        Shape square2 = new Square(10);
        Shape square3 = new Square(20);


        Group listOfShapes = new Group();
        listOfShapes.add(circle1);
        listOfShapes.add(circle2);
        listOfShapes.add(circle3);
        listOfShapes.add(rectangle1);
        listOfShapes.add(square1);

        for (Shape shape : listOfShapes) {
            System.out.println(shape.getArea());
        }

        System.out.println("Min area : " + listOfShapes.getMinArea());




    }
}
