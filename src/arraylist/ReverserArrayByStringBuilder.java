package arraylist;

import java.util.Arrays;
import java.util.SplittableRandom;

public class ReverserArrayByStringBuilder {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};

        StringBuilder sb = new StringBuilder();
        for (int i=arr.length;i>0;i--){
            sb.append(arr[i - 1]).append(" ");

        }

        System.out.println(sb);
    }
}
