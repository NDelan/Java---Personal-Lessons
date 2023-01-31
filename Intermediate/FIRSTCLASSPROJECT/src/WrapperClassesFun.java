import java.util.ArrayList;

public class WrapperClassesFun {
    public static void main(String args[]){
        // Provides a way to use primitive data types as objects
        // Use Integer not int

        //ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        Integer myInt = 5;
        Double myDouble = 5.4;
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());

        // Convert Wrapper Classes

        String myString = myInt.toString();
        System.out.println(myString.length());
    }

    
}
