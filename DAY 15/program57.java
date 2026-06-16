import java.util.*;

public class program57 {
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
     System.out.print("The reverse of the array is ::");
       for (int i = n-1; i>=0 ;i--) {
       
            System.out.print(arr[i] + " ");
}
   System.out.println(); 
     }
    }