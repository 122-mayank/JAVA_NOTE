
import java.util.Scanner;

public class selection_sort {

       public static void selectionSort(int arr[] , int size){

             for(int i = 0 ; i < size-1 ; i++){
                 int min_index = i;
                 for(int j = i + 1 ; j < size ; j++){
                     if(arr[min_index] > arr[j]){
                             min_index = j;
                     }

                 }
                 int temp = arr[min_index];
                 arr[min_index] = arr[i];
                 arr[i] = temp;
             }

       }

       public static void printArray(int arr[] , int size){
                    System.out.println("Sorted Array");
                    for(int i = 0 ;  i < size ; i++){
                           System.out.print(arr[i] + " ");
                    }
                    System.out.println();
       }

       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < size ; i++){
             arr[i] = sc.nextInt();
        }

        selectionSort(arr , size);
        printArray(arr , size);



       }
}
