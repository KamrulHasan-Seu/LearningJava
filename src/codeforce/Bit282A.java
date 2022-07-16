package codeforce;

import java.util.Scanner;

public class Bit282A {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        for(int i=1;i<=n;i++){
            String s = inp.next();
            count += s.contains("+") ? 1 : -1;
        }
        System.out.println(count);
    }
}
