import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea() {
        System.out.println("Area: " + length * breadth);
    }

    void printPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}

public class java18{
    public static void main(String[] args) {
        System.out.println("23DIT017- DARSHAN HOTCHANDANI");
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();

        
        Rectangle[] shapes = new Rectangle[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for shape " + (i + 1) + ":");
            System.out.print("Is it a Square? (yes/no): ");
            String isSquare = scanner.next();

            if (isSquare.equalsIgnoreCase("yes")) {
                System.out.print("Enter the side length: ");
                int side = scanner.nextInt();
                shapes[i] = new Square(side);
            } else {
                System.out.print("Enter the length: ");
                int length = scanner.nextInt();
                System.out.print("Enter the breadth: ");
                int breadth = scanner.nextInt();
                shapes[i] = new Rectangle(length, breadth);
            }
        }

        
        for (Rectangle shape : shapes) {
            System.out.println(shape instanceof Square ? "Square:" : "Rectangle:");
            shape.printArea();
            shape.printPerimeter();
        }
    }
}