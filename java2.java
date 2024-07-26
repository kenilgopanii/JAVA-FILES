import java.util.Scanner;
class java2{

public static void main(String[] args){

char[]  a={'a','b','c','d'};

String[]  b={"...-","..-.",".-..","-..."};

System.out.println("enter your ");
Scanner sc = new Scanner(System.in);
String line = sc.nextLine();

for(int i=0 ; i<line.length(); i++){

char s=line.charAt(i);
if(s==a[i]){

System.out.println(b[i]);
}

}
}

}