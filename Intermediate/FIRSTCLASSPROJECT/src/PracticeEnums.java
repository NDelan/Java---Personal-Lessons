// Enums outside a class

// enum Level {
//     LOW, MEDIUM, HIGH;
// }

// public class PracticeEnums {
//     // static String[] levels = {"Low", "Medium", "High"};
//     public static void main(String[] args){
//         Level l = Level.LOW;
//         System.out.println(l);

//         switch (l) {
//             case LOW:
//             System.out.println("Low Level");
//             break;
//             case MEDIUM:
//             System.out.println("Low Level");
//             break;
//             case HIGH:
//             System.out.println("Low Level");
//             break;          
//         }
//     }
// }

// Enums inside a class


public class PracticeEnums {
    // static String[] levels = {"Low", "Medium", "High"};

    enum Level {
        LOW, MEDIUM, HIGH;

        public static void getLevel() {
            System.out.println(Level.LOW);
        }
    }
    public static void main(String[] args){
        Level l = Level.LOW;
        System.out.println(l);

        // Call Method
        Level.getLevel();

        switch (l) {
            case LOW:
            System.out.println("Low Level");
            break;
            case MEDIUM:
            System.out.println("Low Level");
            break;
            case HIGH:
            System.out.println("Low Level");
            break;          
        }
    }
}