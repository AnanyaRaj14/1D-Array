import java.util.Scanner;
public class sorted{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        // for(int i =0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

       
        System.out.print("the given array is sorted: " + isSorted(arr));

        
    }


    static boolean isSorted(int[] arr){
       
        for(int i =1; i<arr.length; i++){
            if(arr[i]< arr[i-1]){
              return false;
            

            }
        }
        return true;
       
    }
}