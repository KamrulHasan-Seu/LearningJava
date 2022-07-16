import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Before Removing: "+stack);

        stack.remove(1);
        System.out.println("After removing "+stack);

        stack.peek();
        System.out.println("After Peeking "+stack);

        int size = stack.size();
        System.out.println("Size :"+size);




    }
}
