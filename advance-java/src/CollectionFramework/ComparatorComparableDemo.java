package CollectionFramework;

import java.util.*;

public class ComparatorComparableDemo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10) return 1;
                else return -1;
            }
        };

        List<Integer> list1 = new ArrayList<>();
        list1.add(99);
        list1.add(23);
        list1.add(92);
        list1.add(45);

        System.out.println(list1);

        Collections.sort(list1, comparator);

        System.out.println(list1);
    }
}
