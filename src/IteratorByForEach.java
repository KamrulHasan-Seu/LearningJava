import java.util.*;
import java.util.function.Consumer;

public class IteratorByForEach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,15,111,42,78,89);
        //ArrayList<Integer> arrayList = new ArrayList<>(1,4,13,21,432,11,232);
        Consumer<Integer> runnable = System.out::println;

        list.stream().filter(n->n%2==0).parallel().forEachOrdered(runnable);

        Iterator<Integer> iter ;
        iter = list.iterator();
    }
}
