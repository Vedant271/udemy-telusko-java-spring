package CollectionFramework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {
    public static void main(String[] args) {
        Collection<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);

        System.out.println(lst1);

        for(int num: lst1) System.out.println(num);
    }
}
