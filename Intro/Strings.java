class Strings {
    public static void main(String[] args){
        String greeting = "Hello, ";
        System.out.print(greeting);

        String txt = "Please can you come over?";
        System.out.println(txt.toLowerCase());

        // String concatenation
        String firstName = "Del";
        String lastName = "Nut";
        int number = 10;
        
        System.out.println(firstName.concat(lastName));
        // String + int = String
        System.out.println(firstName + number);
        // Break to next line
        System.out.println("The boys\bThe girl");

    }
}
