package codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        s = s.replace("+","");
        char array[] = s.toCharArray();
        Arrays.sort(array);

        for(int i =0;i< array.length;i++){
            System.out.print(array[i]);
            if(i== array.length-1){
                continue;
            }
            System.out.print("+");
        }

    }
}