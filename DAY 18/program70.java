import java.util.*;

public class program70 {
    public static void main(String[] args) { 
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
        

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; 
            for (int k = i + 1; k < n; k++) { 
                if (arr[k] < arr[minIdx]) {
                    minIdx = k; 
            }
            
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    
    }
        System.out.print("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
