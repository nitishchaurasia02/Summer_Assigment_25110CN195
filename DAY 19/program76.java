import java.util.*;
public class program76
{
    public static void main(String[]args)
    {
        int s=0;
         Scanner sc = new Scanner(System.in);
       
        System.out.print("How many elements do you want to enter array ? ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n*n + " elements:");
         int[][]arr = new int[n][n]; 
        for (int i = 0; i < n; i++) {
     for (int j = 0; j < n; j++) {
            arr[i][j] = sc.nextInt(); 
        }
       
    } 
       System.out.println();
        System.out.print("Entered array is: ");
             System.out.println();
        for (int i = 0; i < n; i++) 
            {
             for (int j = 0; j < n; j++) {
 
            System.out.print(arr[i][j] + " ");
        }
 
        System.out.println(); 
    }   
            for (int i = 0; i < n; i++) 
            {
             for (int j = 0; j < n; j++) {
                if(i==j)
                {
 s=s+arr[i][j];
                }
            }
        }
         
        System.out.println("Sum of diagonal elements is::"+s);
    }
} 