package arraylist;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int [] arr = {10,15,11,141,11,1,144};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Element You want to Remove? ");
        int n = scanner.nextInt();

        int i=0;
        boolean check=true;
        for (int j=i;i<arr.length;i++){
            if(arr[i]==n){
                arr[i]=arr[i+1];
                i=i+1;
            }
            System.out.print(arr[i]+" ");

        }
        if(check){
            System.out.println();
            System.out.println("Element Not found");
        }
    }
}
