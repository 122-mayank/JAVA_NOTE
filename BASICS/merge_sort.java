
import java.util.Scanner;
public class merge_sort {


     public  static void merge(int arr[] , int s , int mid , int e){

           int n1 = mid - s;
           int n2 = e - mid +1;

           int left[] = new int[n1];
           int right[] = new int[n2];

           for(int i = 0 ; i < n1 ; i++){
            left[i] = arr[s+i];
           }

           for(int j =0 ; j < n2 ; j++){
                right[j] = arr[mid+j];
           }

           int k = s;

           int i = 0 , j = 0;

           while( i < n1 && j < n2){

            if(left[i] < right[j]){
                 arr[k] = left[i];
                 k++;
                 i++;
            }

            else{
                arr[k] = right[j];
                j++;
                k++;
            }

           }

           while(i < n1){
             arr[k++]=left[i++];
           }

           while(j < n2){
             arr[k++] = right[j++];
           }

     }

     public static void mergeSort(int arr[] , int s ,int e){

        if( s < e){
            int mid = s+(e-s)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);
            merge(arr , s , mid ,e);
        }

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

           mergeSort(arr  ,0, size-1);
           printArray(arr , size);

    }
}
