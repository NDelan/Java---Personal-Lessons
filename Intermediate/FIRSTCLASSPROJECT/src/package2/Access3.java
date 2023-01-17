package package2;

import package1.Access1;

// Can only access a protected value when extends is used
public class Access3 extends Access1 {

    public static void main(String[] args){

        Access3 b = new Access3();
        System.out.println(b.century);
        System.out.println(b.year);
    }
    
}
