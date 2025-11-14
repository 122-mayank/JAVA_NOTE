interface Display{

    public void show();

    default void display(){
         System.out.println("This is the display of interface");
    }
}


class Modifiers implements  Display{

          public void show(){
             System.out.println("This is show of display");
          }

          protected void showProtected(){
                System.out.println("This is protected display");
          }

          private void showPrivate(){
                System.out.println("This is the private display");
          }


          void showPackagePrivate(){
                System.out.println("this is the private package of show");
          }


          public void demonstrateAcess(){

                  showPrivate();

                  showProtected();

                  show();

          }


}






public class AcessModifiers {
     public static void main(String[] args) {

           Modifiers m = new Modifiers();

           m.show();

           m.display();

           m.demonstrateAcess();

     }
}
