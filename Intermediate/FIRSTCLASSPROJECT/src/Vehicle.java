public class Vehicle {
    // Class Attributes Definition
    int maxSpeed;
    int wheels;
    String color;
    double fuelCapacity;

    // Methods
    void horn() {
        System.out.println("Beep!");
    }

    // Constructor
    public Vehicle(){
        wheels = 5;
    }

    // Pass parameters to constructors
    public Vehicle(int y){
        maxSpeed = y;
    }

}

class MyClass {
    // Accessing attributes
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        Vehicle v3 = new Vehicle(454);

        v1.color = "red";
        v2.horn();
        System.out.println(v2.wheels);

        System.out.println(v3.maxSpeed);

        // Using Packages
        // Toolbox toolbox = new Toolbox();
    }
}


