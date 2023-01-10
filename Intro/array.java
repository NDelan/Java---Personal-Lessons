public class array {
    public static void main(String[] args){
        String[] cars = {"Mel", "Del", "Gel"};
        System.out.println(cars.length);

        // Specify the number of elements in array
        int[] data = new int[5];
        data[0] = 4;

        // for each loop
        for (String x: cars) {
            System.out.println(x);
        }
    }

}
