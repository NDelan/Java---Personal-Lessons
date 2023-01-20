public class Polymorphismm {

    public static void main(String[] args) {
        Bird birdObj = new Bird();
        birdObj.sing();

        Robin birdObj2 = new Robin();
        birdObj2.sing();

        Peli birdObj3 = new Peli();
        birdObj3.sing();
    }   
}

class Bird {
    public void sing() {
        System.out.println("tweet tweet");
    }
}

class Robin extends Bird {
    public void sing() {
        System.out.println("toto toto");
    }
}

class Peli extends Bird {
    public void sing() {
        System.out.println("tweaa tsea");
    }
}
