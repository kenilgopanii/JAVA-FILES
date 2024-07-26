import java.util.Arrays;
import java.util.Scanner;

public class java9{
    
    public static void main(String[] args) {
        
        
        System.out.println("enter the string");

        Scanner sc = new Scanner(System.in); 
        
        String line = sc.nextLine();

       

            System.out.print("The length of the string -");
            System.out.println(line.length());

            System.out.print("The upper case is -");
            System.out.println(line.toUpperCase());

            System.out.print("The lower case is -");
            System.out.println(line.toLowerCase());

            System.out.print("The reverse of string is -");

        for(int i=line.length()-1 ; i>=0  ; i--){


            System.out.print(line.charAt(i));

        }

        System.out.print("The sorted case is -");
       
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        
        System.out.println("Original string: " + line);
        System.out.println("Sorted string: " + sortedStr);

    }

}
