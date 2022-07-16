package arraylist;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayByCollection {

        public static void main(String[] args)
        {
            Integer [] arr = {10, 20, 30, 40, 50};
            System.out.println("Before Reverse: "+Arrays.asList(arr));
            Collections.reverse(Arrays.asList(arr));
            System.out.println("After Reverse: "+Arrays.asList(arr));

    }
}
