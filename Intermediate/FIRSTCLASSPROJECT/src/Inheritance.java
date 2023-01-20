// Both protected and private classes can be inherited

public class Inheritance {
    protected String Ex1 = "private Example1";
    public void publicMethod(){
        System.out.println("This is public");
    }
}
class Subclass extends Inheritance {
    //private String subAttribute = "Attribute of subclass";
    public static void main(String[] args) {
 
        //New obj
        Subclass myObj = new Subclass();
        //Call method from super class
        myObj.publicMethod();
    }
}
