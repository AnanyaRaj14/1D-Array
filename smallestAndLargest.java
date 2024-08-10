import java.util.Scanner;
import java.util.Arrays;
public class smallestAndLargest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int[] ans = smallestAndLargestElement(arr);

        System.out.println("smallest: " + arr[0]); 
        System.out.println("largest: " + arr[arr.length-1]);
    }


    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans =  {arr[0], arr[arr.length-1]};
        return ans;   
    }
}