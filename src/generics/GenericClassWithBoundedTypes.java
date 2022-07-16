package generics;

public class GenericClassWithBoundedTypes {
    public static void main(String[] args) {
       // GenericClassWithBound<String> genericClassWithBound = new GenericClassWithBound<String>("Kamrul");
        //Its showing error because GenericclassWithBound only takes Number Types(Int,Double,float,..)
    }
}
class GenericClassWithBound<T extends Number>{
    private T data;

    public GenericClassWithBound(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}