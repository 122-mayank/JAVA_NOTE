

import java.util.*;


public class bubbleSort {


    public static void bubble_sort(int arr[] , int size){


        for(int i = 1 ; i < size ; i++){
                for(int j = 0 ; j < size - i ; j++){
                      if(arr[j] > arr[j+1]){
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                      }
                }
        }
    }


    public static void printArray(int arr[] , int size){
          System.out.println();
          System.out.print("Sorted Array: ");
          for(int i = 0 ; i < size ; i++){
                System.out.print(arr[i] + " ");
          }

    }


     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size ;

       System.out.println("Enter the size of the array: ");
       size = sc.nextInt();

       int arr[] = new int[size];
       System.out.println("Enter the array elements: ");
       for(int i = 0 ; i < size ; i++){
           arr[i] = sc.nextInt();
       }

       bubble_sort(arr , size);
       printArray(arr , size);

     }
}
