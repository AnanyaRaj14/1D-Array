import java.util.Scanner;
import java.util.Arrays;
public class sort_array{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        

       int[] nums =  sortedArray(arr);
        System.out.println("the sorted array is: " + n);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
      
             
    }


    static int[] sortedArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        } 
        return arr;   
    }
}