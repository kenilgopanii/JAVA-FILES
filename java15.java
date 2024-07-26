import java.util.Scanner;

public class java15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(":::::::::::::::::::::MENU::::::::::::::::::::");
        System.out.println("::::::::::::::::::::1.SUM:::::::::::::::::::");
        System.out.println("::::::::::::::::::::2.MUL:::::::::::::::::::");
        System.out.println("::::::::::::::::::::3.SUB:::::::::::::::::::");
        System.out.println("::::::::::::::::::::4.DIV:::::::::::::::::::");
        System.out.print("Enter the given option :- ");
        int option = sc.nextInt();

        System.out.print("Enter first number :- ");
        float a1 = sc.nextFloat();

        System.out.print("Enter second number :- ");
        float a2 = sc.nextFloat();

        float result = 0;

        switch (option) {
            case 1:
                result = sum(a1, a2);
                break;
            case 2:
                result = mul(a1, a2);
                break;
            case 3:
                result = sub(a1, a2);
                break;
            case 4:
                result = div(a1, a2);
                break;
            default:
                System.out.println("Invalid option");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static float sum(float a1, float a2) {
        return a1 + a2;
    }

    public static float mul(float a1, float a2) {
        return a1 * a2;
    }

    public static float sub(float a1, float a2) {
        return a1 - a2;
    }

    public static float div(float a1, float a2) {
        if (a2 != 0) {
            return a1 / a2;
        } else {
            System.out.println("Error : Division by zero ;");
            return 0; 
        }
    }
}
