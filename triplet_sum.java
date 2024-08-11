import java.util.Scanner;
public class triplet_sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        

        System.out.print("Enter the target sum : " );
        int x = in.nextInt();

        sum(arr, x);

        System.out.print("total no. of elements whoes sum is  " + x + " = " + sum(arr, x) );
    }


    static int sum(int[] arr, int x){
        int ans = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++)
                if(arr[i] + arr[j] +arr[k] == x){
                    ans++;
                }
            }
        }
        return ans;
    }
}