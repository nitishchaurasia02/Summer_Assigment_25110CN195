import java.util.*;
public class program74
{
    public static void main(String[]args)
    {
         Scanner sc = new Scanner(System.in);
       
        System.out.print("How many elements do you want to enter array 1? ");
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
  
        System.out.println("Enter the " + n*n + " elements for array 2 :");
    
            int[][] arr2 = new int[n][n]; 
        for (int i = 0; i < n; i++) {
             for (int j = 0; j< n; j++) {
            arr2[i][j] = sc.nextInt(); 
             }
            
            }
           System.out.println();
        
        System.out.print("Entered array is: ");
             System.out.println();
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
       
            System.out.print(arr2[i][j] + " ");
        }
          System.out.println( );
    }
int arr3[][]=new int[n][n];
 for (int i = 0; i < n; i++)
{
             for (int j = 0; j< n; j++) {
                arr3[i][j]=arr[i][j]-arr2[i][j];

             }
            }
               
               System.out.println();
        System.out.print("Diffrence  of both  array is: ");
             System.out.println();
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
       
            System.out.print(arr3[i][j] + " ");
        }
          System.out.println( );
    }
    }
}