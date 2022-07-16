package generics;

public class GenericsClassMain {
    public static void main(String[] args) {

        System.out.println("..........generic Class Portion Start..........");
        GenericsClass<String> stringGenericsClass = new GenericsClass<>("Kamrul"); //creating object of generic class
        System.out.println("String Generic Class returns: "+stringGenericsClass.getData());

        GenericsClass<Integer> integerGenericsClass = new GenericsClass<>(100); //Creating Object of generic class
        System.out.println("Integer Generic Class returns: "+integerGenericsClass.getData());

        System.out.println("..........generic Class Portion End..........");
        System.out.println();
        System.out.println();

        stringGenericsClass.genericmethod("I am learning generics Method by Passing String");
        integerGenericsClass.genericmethod(105);//Get generic method data

        stringGenericsClass.<String>genericmethod("Another way with type Parameter to get Generic method");

//        If we don't pass any Type parameter then compiler
////        automatically  match the type parameter by passing value;

    }

}

class GenericsClass<T>{
    private T data;

    public <T> void genericmethod(T t){
        System.out.println("from generic Method....");
        System.out.println("Data is: "+t);
    }
    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
