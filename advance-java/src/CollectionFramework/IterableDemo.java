package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class IterableDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<Integer>();

        hashSet1.add(82);
        hashSet1.add(90);
        hashSet1.add(23);
        hashSet1.add(60);

        Iterator iterator = hashSet1.iterator();

        while(iterator.hasNext()) System.out.println(iterator.next());
    }
}
