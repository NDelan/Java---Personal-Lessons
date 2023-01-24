import java.util.HashMap;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap <String, Integer> hashObj = new HashMap <String, Integer>();
        hashObj.put("a", 12);
        hashObj.put("b", 4);
        hashObj.put("c", 6);

        System.out.println(hashObj);
        System.out.println(hashObj.get("c"));
    }
}
