import java.util.*;

public class program66 {
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
       
        System.out.print("How many elements do you want to enter array 1? ");
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
       

    
        System.out.print("How many elements do you want to enter in array 2? ");
        int m = sc.nextInt();
        System.out.println("Enter the " + m + " elements:");
            int[] arr2 = new int[m]; 
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt(); 
        }
        
        
        System.out.print("Entered array is: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
         System.out.println();
       Set<Integer> unionset = new LinkedHashSet<>();
       for(int val:arr)
      {  unionset.add(val);
     }
     for (int val:arr2)
     {
        unionset.add(val);
     }
      System.out.println("UNION"+unionset);
    }
}