import java.util.*;
public class program64 {
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
       
        System.out.print("How many elements do you want to enter array ? ");
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
      HashMap<Integer,Boolean> map = new HashMap<>(); 
      for(int i=0;i<n;i++)
      {
        if(!map.containsKey(arr[i]))
{
    System.out.print(arr[i] +"  ");
    map.put(arr[i],true);

}    
    }
        System.out.println();
     }
    }
    

