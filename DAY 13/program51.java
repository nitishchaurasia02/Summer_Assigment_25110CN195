import java.util.*;

public class program51 {
    public static void main(String[] args)
     { 
        int k=0,l=0,s=0;
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
            int largest = arr[0];
int smallest = arr[0];
    
for(int i = 1; i < n; i++)
{
    if(arr[i] > largest)
        largest = arr[i];

    if(arr[i] < smallest)
        smallest = arr[i];
}

System.out.println("Largest element: " + largest);
System.out.println("Smallest element: " + smallest);
     }
    }