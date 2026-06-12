import java.util.*;

public class program50{
   
    public static void main(String[] args)
     { 
        int sum =0;
        int avg=0;
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
            System.out.println(arr[i] + " ");
         
     }
      for (int i = 0; i <n; i++) {
        sum=sum+arr[i];
      }
        System.out.println("Average of the elements is::" +sum/n);
          System.out.println("Sum of the elements is::"+sum);
         
     }
}
    