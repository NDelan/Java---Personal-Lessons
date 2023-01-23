import java.util.ArrayList;

public class JavaListProj {
    public static void main(String[] args){

        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Del");
        nameList.add("Kor");
        nameList.add("Lau");

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

    }
}