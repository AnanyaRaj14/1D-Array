import java.util.Scanner;
public class lastOccurence{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        
        System.out.print("enter x: ");
        int x =in.nextInt();
        
        lastOccurence(arr, x);

        System.out.print("the last occurence of " + x + " is: " + lastOccurence(arr, x) );
    }


    static int lastOccurence(int[] arr, int x){
        int occurence = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == x){
                occurence = i;
            }
        }
        return occurence;
    }
}