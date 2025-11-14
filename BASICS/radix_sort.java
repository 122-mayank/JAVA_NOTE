
import java.util.Scanner;

public class radix_sort {

     public static int getMax(int arr[] , int size){

            int max = arr[0];
            for(int i = 0 ; i < size ; i++){
                 if(max < arr[i]){
                     max = arr[i];
                 }
            }

            return max;

     }

     public static void countSort(int arr[] , int size , int exp){

         int output[] = new int[size];
         int i;
         int count[] = new int[10];

         //set the count of each frequency
         for( i = 0 ; i < size ; i++){
              count[(arr[i]/exp) % 10]++;
         }

         //change the count[i] so that  make changes
         for(i = 1 ; i < 10 ; i++){
             count[i] += count[i-1];
         }


         //build The output array
         for( i = size -1 ; i >= 0 ; i--){
             output[count [ ( arr[i] / exp ) % 10 ] - 1 ] = arr[i];
             count[ ( arr[i] / exp ) % 10 ]--;
         }


          for (i = 0; i < size; i++)
            arr[i] = output[i];

     }

     public static void radixSort(int arr[] , int size){

           int max = getMax(arr , size);

           for(int exp = 1 ; max / exp > 0 ; exp *= 10){
                        countSort(arr , size , exp);
           }

     }

     public static void PrintArray(int arr[] , int size){
        System.out.println("Sorted Array: ");
        for(int i  = 0 ; i < size ; i++){
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
        for(int i = 0 ; i < size ;i++){
             arr[i] = sc.nextInt();
        }

        radixSort(arr , size);
        PrintArray(arr, size);



    }
}
