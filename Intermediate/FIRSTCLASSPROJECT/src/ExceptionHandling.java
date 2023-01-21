public class ExceptionHandling {
    public static void main(String[ ] args) {
        try {
            int a[ ] = new int[5];
            System.out.println(a[6]);
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
