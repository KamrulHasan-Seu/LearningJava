package codeforce;

import java.util.Scanner;

public class StonesInTheTable266A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count=0;
        String s = input.next();

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
        }



        System.out.println(count);
    }
}
