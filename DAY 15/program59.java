import java.util.*;
public class program59 
{
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("How many elements do you want to enter? ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.print("Entered array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
int s=0;
System.out.print("How much left rotation you want to do ?");
s=sc.nextInt();
for(int i=0;i<s;i++)
{
    int temp=arr[n-1];
for (int j=n-1;j>0;j--)
{  
    arr[j]=arr[j-1];
}
    arr[0]=temp;
}

  System.out.print("Rotated array  ");

 for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

    }
    
}  
}
