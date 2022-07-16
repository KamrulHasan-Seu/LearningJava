package statics;

public class StaticTest {
    public static void main(String[] args) {
        Student s1 = new Student("Kamrul");
        Student s2 = new Student("Tarok");

        s1.display();
        s2.display();
    }


    public static class Student{
        String name;
          int id;
        static String collageName = "SEU";

        static int counter =0;
        
        public Student(String name) {
            this.name = name;
            id = setId();
        }

        public int setId(){
            counter++;
            return counter;
        }

         void display(){
            System.out.println("Name is: "+name
                    +" "+id+" "+collageName);
        }

    }
}

