package arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InsertingspecificPosition {
    public static void main(String[] args) {
        int initialArray[] = {2,100,14,1,10};

        Scanner input = new Scanner(System.in);
        System.out.println("Give Position and Element Value: ");

        int pos = input.nextInt();
        int value = input.nextInt();

        if(pos>=0 && pos<= initialArray.length){
            for(int i = initialArray.length;i>pos;i--){
                initialArray[i] = initialArray[i-1];
                initialArray[pos] = value;
            }
        }else{
            System.out.println("Invalid Length");
        }

        for(int j =0;j< initialArray.length;j++){
            System.out.println(initialArray[j]);
        }
    }


}
