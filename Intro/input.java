import java.util.Scanner;

class input {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in); //Create Scanner object
        String name = myObj.nextLine(); //Take string input
        System.out.println("Name " + name); //Print string output
    }

}
