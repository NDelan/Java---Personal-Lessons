import java.util.HashSet;

public class HashSetFun {
    public static void main(String[] args){
        HashSet <String> setObj = new HashSet<String>();
        setObj.add("Hap");
        setObj.add("Lau");
        setObj.add("Del");

        for (String i: setObj){
            System.out.println(i);
        }
        System.out.println(setObj);
    }
}