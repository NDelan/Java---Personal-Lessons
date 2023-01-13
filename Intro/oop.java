public class oop {
    int x = 5;
    public static void main(String[] args) {
      oop myObj1 = new oop();
      oop myObj2 = new oop();

      myObj2.x = 89;
      System.out.println(myObj1.x);
    //   set new value
      // myObj.x = 40;
      System.out.println(myObj2.x);
    }

      // Use 'final' to set the value to constant 

    // Public
    public void myPublicMethod() {
      System.out.println("Public method");
    }

}