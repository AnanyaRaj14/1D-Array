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

    }


    static int repeate(int[] arr){
        // int ans = -1;
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j] ){
                  arr[i] = arr[j] = -1;  
                }
            }
        }
        
        int ans = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != -1){
                ans = arr[i];
            }
        }
        return ans;
    }
}