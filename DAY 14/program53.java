import java.util.*;

public class program53 {
    public static void main(String[] args)
     { 
        int flag=0,j=0;
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
        int k;
        System.out.print("Enter the element to search::");
        k=sc.nextInt();
    
for (int i = 0; i < n; i++) {
        if(arr[i]==k)
        {
        flag=1;
        j=i;
      break;
}
}
if (flag==1)
{
System.out.print("Element found at index ----"+j);
   }   else 
    {    System.out.print("Element not found ");
    }
}
}