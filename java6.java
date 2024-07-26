import java.util.Scanner;

public class java6{
    public static void main(String[] args) {
        
        int n;
        
        System.out.println("Enter your input:");
        Scanner sc = new Scanner(System.in); 
        
        String line = sc.nextLine();
        
        System.out.println("Enter number how many time yo want repeat:");
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt(); 
        
        String aline ="";
        
          if (line.length() > 3)
            {
             aline = line.substring(0,3);
             } 
             else 
             {
                 aline = line;
            }

        for(int i=0; i< x; i++){
        System.out.println(aline);
        }
    }
}
