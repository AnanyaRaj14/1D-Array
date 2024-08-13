
// ************************************************* NOT COMPLETE ****************************************************
import java.util.Scanner;
public class second_max{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }



        int finalAns = findSecondMax(arr);
        System.out.print("the second max element of the array is : " + findSecondMax(arr));
    }


   
    static int findSecondMax(int[] arr){
        int ans = findMax(arr);

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == ans){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        
        int secondMax = findMax(arr);
        return secondMax;
    }

    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        return mx;
    }

}
    
