import  java.util.*;
public class ObjectClass {

     int marks;
     int age;

      private ObjectClass(int marks,int age){
             this.marks = marks;
             this.age =age;
             System.out.println("Private Constructor is called!!");
      }

      public static ObjectClass createnewInstance(int marks,int age){
           return new ObjectClass(marks,age);
      }

     @Override public String toString(){
         return " Marks: "+ marks + " age: "+ age;
     }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = sc.nextInt();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        ObjectClass ob = ObjectClass.createnewInstance(marks , age);

        System.out.println(ob);




    }
}
