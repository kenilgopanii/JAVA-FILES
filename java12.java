import java.util.Scanner;

public class java12{
    
    public static void main(String[] args) {
        
        
        System.out.print("enter the pound convert into rupees ");

        Scanner sc = new Scanner(System.in); 
        int line = sc.nextInt();
        System.out.print(+line);
        System.out.print(" pound in rupees is ");
        line=line*100;
        System.out.println(+line);
        
        
         System.out.print("enter the rupees convert into pound ");  
         
        Scanner scc = new Scanner(System.in); 
        int linee = scc.nextInt();
        System.out.print(+linee);
        System.out.print(" rupees in rupees is ");
        linee=linee/100;
        System.out.print(+linee);

    }
}
