package codeforce;

import java.util.Scanner;

public class VenyaAndFence677A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
       int a;
        int count=n;
       for(int j=1;j<=n;j++){
           a= sc.nextInt();
           if(a>h){
               count+=1;
           }
       }

        System.out.println(count);
    }
}
