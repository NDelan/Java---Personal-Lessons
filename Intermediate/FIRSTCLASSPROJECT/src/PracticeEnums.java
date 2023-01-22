enum Level {
    LOW, MEDIUM, HIGH;
}

public class PracticeEnums {
    // static String[] levels = {"Low", "Medium", "High"};
    public static void main(String[] args){
        Level l = Level.LOW;
        System.out.println(l);

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
