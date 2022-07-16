package codeforce;

import java.util.Scanner;

public class SoldiersandBananas546A {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        int n = inp.nextInt();
        int w = inp.nextInt();

        int p=0,tk;
        for(int i =1 ;i<=w;i++){
            p = p+i*k;
        }

        tk = p-n;
if(tk>0) {
    System.out.println(tk);
}else{
    System.out.println(0);
}
    }
}
