import java.util.Scanner;
public class first_repeating{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int repeate = lastRepeating(arr);
        System.out.print("the last element of the array that is repeating itself is : " + lastRepeating(arr));

        
    }


    static int lastRepeating(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
        
    }
}