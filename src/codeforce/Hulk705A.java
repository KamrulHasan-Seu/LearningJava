package codeforce;

import java.util.Scanner;

public class Hulk705A {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        //----------Its first Solving Process---------------//
 //       String hate ="I hate";
//        for(int i=2;i<=n;i++){
//            if(i%2==0){
//                hate =hate+" that I love";
//            }else{
//                hate = hate+" that I hate";
//            }
//        }
//        System.out.println(hate+" "+"it");

        ///---------------Second Solving Process----///
        for(int i = 1; i <= n; i++) {
            System.out.print("I " + (i % 2 == 0?"love ":"hate ") + ( i == n?"it ":"that "));
        }

    }
}
