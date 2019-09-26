import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Shape Test ");
            System.out.println("2. Circle Test ");
            System.out.println("3. Rectangle Test");
            System.out.println("4. Square Test ");
            System.out.println("0. Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    ShapeTest();
                    break;
                case 2:
                    CircleTest();
                    break;
                case 3:
                    RectangleTest();
                    break;
                case 4:
                    SquareTest();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("just input 0 to 4.");
                    break;
            }
        }
    }

    private static void ShapeTest(){
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }

    private static void CircleTest(){
        Circle circle = new Circle(1.0);
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("white", false, 3.5);
        System.out.println(circle);
    }

    private static void RectangleTest(){
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }

    private static void SquareTest(){
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }

}