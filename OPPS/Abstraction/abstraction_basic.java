abstract  class Vehicle{
     abstract  void speed();
     abstract void model();

     void engine(){
         System.out.println("Every vehicle has engine!!");
     }
}

class Car extends  Vehicle{

     @Override
     void speed(){
         System.out.println("Car has greater speed!!");
     }

     @Override
     void model(){
         System.out.println("Cars has various models!!");
     }


}

class Bicycle extends Vehicle{

    @Override
    void speed(){
         System.out.println("Bicycle has speed less than car");
    }
    @Override
    void model(){
         System.out.println("Bicycle has not enough model comapred to car");
    }

}


public class abstraction_basic {
     public static void main(String[] args) {

         Car c = new Car();
         c.engine();
         c.speed();
         c.model();
         System.out.println();
         Bicycle b = new Bicycle();
         b.engine();
         b.speed();
         b.model();

     }
}
