public class ExceptionHandling {
    public static void main(String[ ] args) {
        try {
            int a[ ] = new int[5];
            System.out.println(a[6]);
        } catch (Exception e) {
            System.out.println("An error occured");
        } finally {
            System.out.println("Finally executes code regardless of result");
        }

        static void main(int age) {
            if (age < 18) {
                throw new ArithmeticException("Access denied");
            }
            else {
                System.out.println("Welcome");
            } 
    }
}