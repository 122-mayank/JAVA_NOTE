
import java.util.*;

public class insertionSort {

     public static void insertion_sort(int arr[] , int size){

               int i , j;
               for( i = 1 ; i < size ; i++){
                  int temp = arr[i];

                  for( j = i-1 ; j>=0 ; j--){

                     if (temp < arr[j]) {
                      arr[j+1] = arr[j];
                     }
                     else{
                        break;
                     }


                  }
                  arr[j+1] = temp;


               }

     }

     public static void printArray(int arr[] , int size){

             System.out.println();
             System.out.println("Sorted Array: ");
             for(int i = 0 ; i < size ; i++){
                 System.out.print(arr[i]+" ");
             }
     }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size;

    System.out.println("Enter the size of the array: ");
    size = sc.nextInt();

    int arr[] = new int[size];
    System.out.println("Enter the array elements: ");
    for(int i = 0 ; i < size ; i++){
         arr[i] = sc.nextInt();
    }

    insertion_sort(arr , size);
    printArray(arr , size);


    }
}
