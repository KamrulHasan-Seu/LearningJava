package collectionframwork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListMain<I extends Number> {
    public static void main(String[] args) {
        List<Integer> arraylist = new java.util.ArrayList<>();
        arraylist.add(1);
        arraylist.add(1,2);
        arraylist.add(2,3);
        arraylist.add(3,4);
        arraylist.add(4,5);

        System.out.println("Before Adding:"+arraylist);

        Set<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);

        arraylist.addAll(set);
        System.out.println("After Adding set:"+arraylist);

        System.out.println("Getting value of index 0: "+arraylist.get(0));
        System.out.println("Set value on index 2: "+arraylist.set(2,10));
        System.out.println("After set:"+arraylist);
        System.out.println("Removing value of index 2: "+arraylist.remove(2));
        System.out.println(arraylist);
        System.out.println("Arraylist size: "+arraylist.size());
    }


}
