import java.util.*;
public class program55 {
    public static void main (String []args)

{

        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many elements do you want to enter in array ? ");
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
 Arrays.sort(arr);
  System.out.println( "The sorted array::");
  System.out.println(Arrays.toString(arr));

          System.out.println("Second largest::"+arr[n-2]);
}
    }
