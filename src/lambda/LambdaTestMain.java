package lambda;

import java.util.ArrayList;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class LambdaTestMain {
    //Printing Array List Element with Lambda
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("kamrul");
        arrayList.add("Tarok");

        arrayList.forEach(n -> System.out.println(n));
        //We can introduce a variable to this lambda expression like below
        Consumer<String> consumer = n -> System.out.println(n);
        System.out.println("After Adding Lambda to a local variable by Consumer....");
        arrayList.forEach(consumer);
    }
}
