import java.util.*;

public class program61 {
    public static void main(String[] args)
     { 
        int S=0,s=0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; 
        System.out.print("How many elements do you want to enter? ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        
        
        System.out.print("Entered array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
        
          for (int i = 0; i < n; i++) {
            s=s+arr[i];
    }
    S=((n+2)*(n+1))/2;
    int m=S-s;
    System.out.print("The missing number is ::"+m);
}
}