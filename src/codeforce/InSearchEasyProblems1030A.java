package codeforce;

import java.util.Scanner;

public class InSearchEasyProblems1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String check ="true";
        for(int i=1;i<=n;i++){
            int p = sc.nextInt();
            if(p==1){
                check="false";
                break;
            }
        }
        System.out.println(check.equals("true")?"EASY":"HARD");
    }
}
