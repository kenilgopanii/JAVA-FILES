import  java.util.Scanner;

class java3{

public static void main(String[] args){

System.out.println("enter mobile number");

Scanner sc = new Scanner(System.in);

long mobileNumber = sc.nextLong();


long a,b,c;

a=mobileNumber/100000000;

b=mobileNumber/100000%1000;

c=mobileNumber%100000;

System.out.println(" \n AA is "+a);
System.out.println("BBB is "+b);
System.out.println("CCCCC is "+c);
}




}