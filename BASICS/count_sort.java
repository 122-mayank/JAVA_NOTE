

import java.util.Scanner;
public class count_sort {
     public static int[] countSort(int arr[] , int size){

         //finding the maximum
         int max = arr[0];
         for(int i = 0 ; i < arr.length ; i++){
             if(max < arr[i]){
                max = arr[i];
             }
         }

         int output[] = new int[size];

         //make the count array
         int count[] = new int[max+1];

         //count the frequencies of all the elements
         for(int i = 0 ; i < arr.length ;i++){
              count[arr[i]]++;
         }

         //change the count values
         for(int i = 1 ; i <=max ; i++){
             count[i] = count[i] + count[i-1];
         }

         //build the output array
         for(int i = size - 1 ; i >= 0 ; i--){
             output[count[arr[i]]-1] = arr[i];
             count[arr[i]]--;
         }

         return output;

     }

     public static void print(int arr[] , int size){

         System.out.println("Sorted Array!");
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

       int ans[] =  countSort(arr , size);
        print(ans, size);

    }
}
