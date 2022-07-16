package codeforce;

import java.util.Scanner;

public class BearBigBrother791A {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int count=0;

        while(true){
            count++;
            a=a*3;
            b=b*2;
            if(a>b){
                break;
            }
        }
        System.out.println(count);
    }

}
