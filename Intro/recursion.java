public class recursion {
    public static void main(String[] args){
        int result1 = sum(10);
        int result2 = sum1(5,9);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int sum(int k) {
        if (k == 0) {
            return 0;
        } else {
            return k + sum(k - 1);
        }
    }
    // Add numbers from a start int to another

    public static int sum1(int start, int end) {
        if (end > start){
            return end + sum1(start, end-1);
        } else{
            return end;
        }
    }
}
