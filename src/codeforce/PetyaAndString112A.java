package codeforce;

import java.util.Scanner;

public class PetyaAndString112A {
    public static void main(String[] args) {
        String s1, s2;

        Scanner inp = new Scanner(System.in);

        s1 = inp.nextLine();
        s2 = inp.nextLine();

        int i = s1.compareToIgnoreCase(s2);
        if(i<0){
            System.out.println(-1);
        }
        if(i>0){
            System.out.println(1);
        }
        if(i==0){
            System.out.println(0);
        }
    }
}
