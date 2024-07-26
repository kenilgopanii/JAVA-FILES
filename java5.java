import java.util.Scanner;


class main{

public static void main(String[] args){

  
    double y;
    double z = Math.random();
    double a = z * 100;
    y = (int)a + 1;
    

    System.out.println(y);

    System.out.println("enter the random number :-");

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    
    int b =  (int )y - (int)x;
    
    
    if(b>50 || b>-50){
        
        System.out.println("number is too low");
        
        
    }else{
        
        
        System.out.println("number is too high");
        
    }

}




}