package arraylist;

import java.util.Arrays;

public class DuplicateArrayCheck {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,2,5,1,6,5,6};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
