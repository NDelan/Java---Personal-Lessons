public class cond {
    public static void main(String[] args){
        // Short Hand If...Else Statement(Ternary Operator)
        int temp = 102;
        if (temp < 100){
            System.out.println("Not Boiling");
        } else {
            System.out.println("Boiling");
        }
        // Using Ternary Operator
        // Syntax: variable = (condition) ? expressionTrue : expressionFalse;

        String result = (temp < 100) ? "Not Boiling" : "Oops! Boiling.";
        System.out.println(result);

        // Using Switch Case
        /*Syntax: 
         swith (expression) {
            case x:
                //code block
                break;
            case y:
                //code block
                break;
            default:
                //code block
         }
         */

        //  int day = 2;
        int day = 3;
         switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            // Executes when there is no match. Needs no break.
            default:
                System.out.println("No match"); 
         }

        //  Loops 
        /*
         while (condition){
            // Block to be executed
         }
         */
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        // Do...While

        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        // Using for loop
        for (int j = 0; j<=10; j += 2) {
            System.out.println(j);
        }

        // For each loop
        String[] persons = {"Del", "Lau", "Van"};
        for (String person : persons){
            System.out.println(person);
        }

        // Using Break and Continue
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }

        // Using break and continue in while loop
        int a = 0;
        while (a < 10) {
            if (a == 4) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }

        // Arrays
        String[] cars = {"Volvo", "Fef", "Del"};
        // Change first element
        cars[0] = "Laud";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        // Loop through array
        for (int b = 0; b < cars.length; b++) {
            System.out.println(cars[b]);
        }

        System.out.println("Alternative to looping through array");
        for (String car: cars) {
            System.out.println(car);
        }

        // Multidimensional Array
        int[][] multiArray = {{1,2,3,4}, {5,6,7,8}};
        for (int ele = 0; ele < multiArray.length; ele++){
            for (int j = 0; j < multiArray[ele].length; j++){
                System.out.println(multiArray[ele][j]);
            }
        }
    }
}
