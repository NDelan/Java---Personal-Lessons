import java.util.HashMap;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap <String, Integer> hashObj = new HashMap <String, Integer>();
        hashObj.put("a", 12);
        hashObj.put("b", 4);
        hashObj.put("c", 6);

        System.out.println(hashObj);
        System.out.println(hashObj.get("c"));
        System.out.println(hashObj.containsKey("b"));
        System.out.println(hashObj.replace("c",43));
        System.out.println(hashObj);

        for (String i: hashObj.keySet()) {
            System.out.println("The value of " + i + " is: " + hashObj.get(i));
        }
    }
}