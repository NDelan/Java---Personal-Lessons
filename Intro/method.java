public class method {
    //Define method
    static void myMethod(String fname, int age){
        System.out.println("Legooo");
        System.out.println("I am " + fname + ". I am " + age);
    }

    static void myAge(int age){
        if (age < 18 ) {
            System.out.println("Under age");
        } else {
            System.out.println("Adult");
        }
    }
    //Call method
    public static void main(String[] args){
        myMethod("Del", 12);
        // myAge(12);
    }
}
