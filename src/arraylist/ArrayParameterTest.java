package arraylist;

public class ArrayParameterTest {
    public static int findMax(int arr[]){
        int max = arr[0];

        for (int i =1;i< arr.length;i++){
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int myArr[] = {100,99,98,97,1,3,7,123};
        int maxNum = findMax(myArr);

        System.out.println("Maximum Number is: "+maxNum);
    }
}
