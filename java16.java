public class java16{

    public void printParent() {
        System.out.println("This is parent class");
    }
}

public class ChildClass extends ParentClass {

    public void printChild() {
        System.out.println("This is child class");
    }
}

public class Main {

    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass childObj = new ChildClass();

        parentObj.printParent();

        childObj.printChild();

        childObj.printParent();
    }
}
