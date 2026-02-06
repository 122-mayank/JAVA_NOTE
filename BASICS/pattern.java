import java.util.Scanner;
public class pattern{

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          int row , col;
          System.out.println("Enter the row & col: ");
          row = sc.nextInt();
          col = sc.nextInt();

          //  for the upper triangle
           for(int i = 1 ; i <= row ; i++){

                for(int  j = col ; j > i ; j--){
                      System.out.print(" ");
                }
                for(int k = 1 ;  k <= i ; k++){
                    System.out.print("* ");
                }

                System.out.println();

           }

           //for the lower triangle
           for(int i= 2 ; i <= row ; i++){

                for(int j = 1 ; j < i ; j++){
                     System.out.print(" ");
                }
                for(int k = col ; k >= i ; k--){
                    System.out.print("* ");
                }
                System.out.println();
           }
     }
}
