
import java.util.Scanner;


class java4{

public static void main(String[] args){

System.out.println("\t menu");
System.out.println("\t 1 motor");
System.out.println("\t 2 fan");
System.out.println("\t 3 tubeliht");
System.out.println("\t 4 wire");
System.out.println("\t 5 exit");


Scanner sc = new Scanner(System.in);
int x = sc.nextInt();

String[] a={"motor", "fan", "tubel", "wire"};
int[] b={"15000","7000","300","100"};
int[] c={"8","12","5","7.5"};


do{
switch (x) {
    case 1 :
        
        break;
    case 2 :

        break;
    default:
        
}
}while(x!=5);

}




}