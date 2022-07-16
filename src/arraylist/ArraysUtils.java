package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class ArraysUtils {
    public static void asList(int[] arr){
        List<Integer> asList = new ArrayList<>();
        for (int i:arr) {
            asList.add(Integer.valueOf(i));
        }
        System.out.println("Arrays.asLists: "+asList);
    }

    public static void main(String[] args) {
        int sampleArray[] = {23,1,4,22,15,16};
        asList(sampleArray);

        //Print as List
//        List<Integer> asList = Arrays.asList(sampleArray);
//        System.out.println("Arrays.asList: "+asList);

        //Binary Sort Process
         Arrays.sort(sampleArray);
        System.out.print("After Sorting..... ");
        for (int i:sampleArray) {
            System.out.print(i+" ");
        }
        System.out.println();
         int indexFind = 22;
        System.out.println("Binary Sort is:"+Arrays.binarySearch(sampleArray,indexFind));


        //Equal function
        int Arr[] = { 10, 20, 11, 21, 31 };

        int Arr1[] = { 10, 11, 21,2,1 };

        System.out.println("Integer Arrays on comparison are : " + Arrays.equals(Arr, Arr1));


        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());

        stringBuffer.append("12345678912345678");
        System.out.println(stringBuffer.capacity());

    }


}