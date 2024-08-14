import java.util.Scanner;
public class small_max_self{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array: " );
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements of the array: " );

        for(int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

       
        maxMin(arr);
       

      
    }


    static void maxMin(int[] arr){
       int max =  max(arr);
        int min = min(arr);
        System.out.println("the max is : " + max);
        System.out.println("the min is : " + min);
        
    }
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max; 
    }
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min; 
    }
    
}