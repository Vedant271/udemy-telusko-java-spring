package CollectionFramework;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();

        hashMap1.put("Harshali", 23);
        hashMap1.put("Nitin", 11);
        hashMap1.put("Umar", 34);
        hashMap1.put("Vinayak", 12);
        hashMap1.put("Sagar", 55);

        System.out.println(hashMap1);

        System.out.println(hashMap1.keySet());

        System.out.println(hashMap1.entrySet());

        System.out.println(hashMap1.values());
    }
}
