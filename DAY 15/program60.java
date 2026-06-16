import java.util.*;

public class program60 {
    public static void main(String[] args)
     { 
        int nz=0;
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
     for (int i = 0; i < n; i++) {
        if (arr[i]!=0)

            {
             arr[nz]=arr[i];
             nz++;
            }
        }
            while(nz<n)
                {
                  arr[nz]=0;
                  nz++;
            }
                
 for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
 }
            
        System.out.println();
}
}