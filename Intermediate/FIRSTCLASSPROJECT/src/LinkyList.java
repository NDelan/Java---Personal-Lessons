import java.util.LinkedList;

public class LinkyList {
    public static void main(String[] args) {
        LinkedList <Integer> linky = new LinkedList <Integer>();
        linky.add(3);
        linky.add(4);
        linky.add(5);

        for (int i: linky) {
            System.out.println(i);
        }

    }
}