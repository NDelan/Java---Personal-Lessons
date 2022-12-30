class typeconversion {
    public static void main(String[] args){
        // Conver int to double
        int number1 = 5;
        double number2 = number1;

        System.out.println(number2);

        // Convert double to int by casting
        double number3 = 5.8;
        int number4 = (int)number3;
        System.out.println("Conversion from double to int by casting");
        System.out.println(number4);

        // Literal String and Object String
        String literalString1 = "abc";
        String literalString2 = "abc";

        // Literal String and Object String
        String ObjectString1 = new String("abc");
        String ObjectString2 = new String("abc");

        System.out.println(literalString1 == literalString2);
        System.out.println(ObjectString1 == ObjectString2);  
    }
}