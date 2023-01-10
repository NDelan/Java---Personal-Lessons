public class methods {
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

    // Method Overloading

    static int mySum(int a, int b){
        return a + b;
    }

    static double mySum(double a, double b){
        return a + b;
    }
    //Call method
    public static void main(String[] args){
        myMethod("Del", 12);
        // myAge(12);
        int num1 = mySum(2,3);
        double num2 = mySum(2.4,3.3);

        System.out.println(num1);
        System.out.println(num2);

    }
}
