package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        // Never ever rely on hashset ordering,
        // even in case of, .add(1) .add(2) .add(3) .add(4), hashset buckets will be 1,2,3,4 most of the time this will
        // look sorted but java never guarantees order in hashset
        hashSet1.add(1);
        hashSet1.add(4);
        hashSet1.add(3);
        hashSet1.add(2);

        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        // in case of, .add(62) .add(54) .add(82) .add(21),
        // HashCode for Integer
        //hashCode = value
        //Default HashSet capacity
        //16
        //Bucket index formula
        //index = hash & (capacity - 1)
        //index = hash & 15
        // Bucket calculation
        //Value	Hash	Index
        //62	62	62 & 15 = 14
        //54	54	54 & 15 = 6
        //82	82	82 & 15 = 2
        //21	21	21 & 15 = 5
        // Buckets:
        //1
        //2  -> 82
        //3 ..
        //5  -> 21
        //6  -> 54
        //7..
        //14 -> 62
        //
        //Iteration goes bucket index order:
        //
        //[82, 21, 54, 62]
        //
        //Not sorted.
        // look sorted but java never guarantees order in hashset
        hashSet2.add(62);
        hashSet2.add(54);
        hashSet2.add(82);
        hashSet2.add(21);

        System.out.println(hashSet2);

        for(int num: hashSet2) System.out.println(num);
    }
}
