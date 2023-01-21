interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class MultiInheritace implements FirstInterface, SecondInterface{
    public void myMethod() {
        System.out.println("My first method");
    }

    public void myOtherMethod() {
        System.out.println("My second method");
    }
}
public class Interface {
    public static void main(String[] args) {
        MultiInheritace myObj = new MultiInheritace();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
