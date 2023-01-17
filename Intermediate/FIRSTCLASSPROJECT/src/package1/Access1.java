package package1;

public class Access1 {
    
    int days = 4;
    int months = 7;
    public int year = 12;
    protected int century = 34;
}

// Non Access Modifiers(static,final, abstract)
// static: Independent of the object
// final: value can't be changed, method can't be overriden,
// class can't be inherited
// abstract: subclasses

abstract class Main {
    public String name = "Del";
    public int age = 43;
    public abstract void study();
}

class Student extends Main {
    public void study() {
        System.out.println("Let's go");
    }
}

