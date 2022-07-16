package codeforce;

import java.util.Scanner;

public class AntonOrDanik734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.next().replaceAll("D","").length();
        System.out.println(a>n-a?"Anthon":n-a>a?"Danik":"Friendship");
    }

}
