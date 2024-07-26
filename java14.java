import java.util.Scanner;

class Area {
    Float length, breadth;
    
    public Area(Float length, Float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public Float returnArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        Float length = scanner.nextFloat();
        
        System.out.print("Enter breadth of rectangle: ");
        Float breadth = scanner.nextFloat();
        
        Area rectangleArea = new Area(length, breadth);
        
        Float area = rectangleArea.returnArea();
        System.out.println("Area of rectangle: " + area);
        
    }
}
