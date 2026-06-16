import java.util.*;

public class program63{
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
  System.out.print("Enter the value for which pairs are to be searched ::");
  int f=sc.nextInt();
boolean found =false;
 for (int i = 0; i < n-1; i++) {
    int r=f-arr[i];
    for (int j = i+1 ; j < n; j++) {
        if(r==arr[j])

{
      System.out.println("The pairs for the sum are::"+arr[j]);
        System.out.print(" and "+arr[i]);
        found=true;
}   

     }
    }
if(!found)
{
    System.out.print("Not found");
}
    }
}
