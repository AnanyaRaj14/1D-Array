import java.util.Scanner;
public class greater{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        

        System.out.print("Enter x: " );
        int x = in.nextInt();

        greaterThan(arr, x);

        System.out.print("total no. of elements greater than  " + x + " is: " + greaterThan(arr, x) );
    }


    static int greaterThan(int[] arr, int x){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
}