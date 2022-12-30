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
    }
}