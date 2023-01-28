import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFun {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Del");
        names.add("Lau");
        names.add("Vhim");

        // Get Iterator
        Iterator<String> it = names.iterator();

        System.out.println(it.next());
    }
}
