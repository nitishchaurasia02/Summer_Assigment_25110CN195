import java.util.*;

public class program65 {
    public static void main (String []args)

{

        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many elements do you want to enter in array 1? ");
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
        
       
        
    
        System.out.print("How many elements do you want to enter in 2 nd array ? ");
        int m = sc.nextInt();
        System.out.println("Enter the " + m+ " elements:");
            int[] arr2 = new int[m]; 
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt(); 
        }
        
        
        System.out.print("Entered array is: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(); 
        int arr3[]=new int[n+m];
        int k=0;
          for (int i = 0; i < n; i++) {
 
            arr3[k]=arr[i];
            k++;
          }

               for (int j= 0; j < m; j++) {
          
arr3[k]=arr2[j];
k++;

               }

        
   System.out.println(Arrays.toString(arr3));
        }
    
}
