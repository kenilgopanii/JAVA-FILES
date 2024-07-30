
class shape{
    void display() {
        System.out.println("This is the shape");
    }
 

}
class rectangle extends shape{
    void displa() {
    System.out.println("This is the rectangle shape");
    }
}
class circle extends shape{
    void displ() {
    System.out.println("This is the circle shape");
    }
}
class square extends rectangle{
    void disp() {
    System.out.println("This is the aquare shape");
    }
}
public class java19 {
    public static void main(String[] args) {
       
        square s1 = new square();
        s1.display();
        s1.displa();

    }
}
