package codeforce;

import java.util.Scanner;

public class NearLuckyNumber110a {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =	sc.next().replaceAll("[^47]","").length();
        System.out.print(n==4|n==7?"YES":"NO");
    }
}
