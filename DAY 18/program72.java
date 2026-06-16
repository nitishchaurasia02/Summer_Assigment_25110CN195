
import java.util.*;

public class program72 {
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
      
        System.out.print("How many elements do you want to enter? ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " elements:");
          int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        
        
        System.out.print("Entered array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
         for (int i = 0; i < n-1; i++) {
            
  for (int k = 0; k < n-1-i; k++) {
            
if (arr[k]<arr[k+1])
{
    int temp=arr[k];
arr[k]=arr[k+1];
arr[k+1]=temp;
}
}
            }
 System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
