class OuterClass {
    int x = 10;

    // Declare as Private if no other class should inherit

    protected class InnerClass {
    int y = 5;
    }
}
public class OuterClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

