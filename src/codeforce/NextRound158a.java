package codeforce;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NextRound158a {
    public static void main(String[] args) {
        int totalGrades,passMark,count=0;

        Scanner input = new Scanner(System.in);
        totalGrades = input.nextInt();
        passMark = input.nextInt();

        int totalGradesArray[] = new int[totalGrades];

        for (int i =0 ;i<totalGrades;i++){
            totalGradesArray[i] = input.nextInt();

            if(totalGradesArray[i] >0 && totalGradesArray[i]>=totalGradesArray[passMark-1]){
                count++;
            }
        }
        System.out.println(count);

    }
}
