package arraylist;


public class   MaximumAndMinimum {
    static int max;
    static int min;
    private static void findValue(int[] myArray) {
         max = myArray[0];
         min = myArray[0];

        for(int i=0;i< myArray.length;i++){
            if(myArray[i]>max){
                max = myArray[i];
            }
            if(myArray[i]<min){
                min = myArray[i];
            }
        }
    }
    public static void main(String[] args) {
        int myArray[] = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        findValue(myArray);
        System.out.println("Maximum value is: "+ max);
        System.out.println("Minimum values is "+min);
    }

}
