public class condition {
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
    }
}