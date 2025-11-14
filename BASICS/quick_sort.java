
import java.util.Scanner;

public class quick_sort {


     public static int partiton(int arr[] , int s , int e){

            int pivot = arr[s];
            int count= 0;

            for(int i = s+1 ; i <=e ; i++){
                 if(pivot >= arr[i]){
                     count++;
                 }
            }

            int pivotindex = s + count;

            int temp = arr[pivotindex];
            arr[pivotindex] = arr[s];
            arr[s] = temp;

            int i= s , j = e;

            while( i < pivotindex && j > pivotindex){

                 while(arr[i] < pivot){
                    i++;
                 }

                 while(arr[j] > pivot){
                    j--;
                 }
                 if(i < pivotindex && j > pivotindex){
                      temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;

                      i++;
                      j--;
                 }
            }
            return pivotindex;

     }


      public static void quickSort(int arr[] , int s , int e){


        if(s>=e){
            return;
        }


                    int pi = partiton(arr , s ,e);
                    quickSort(arr, s, pi -1 );
                    quickSort(arr, pi + 1, e);



      }


     public static void printArray(int arr[] , int size){
            System.out.println("Sorted Array: ");
            for(int i = 0 ; i < size ; i++){
                  System.out.print(arr[i] + " ");
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

          quickSort(arr , 0 , size-1);
          printArray(arr , size);


    }
}
