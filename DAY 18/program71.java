import java.util.*;

public class program71 {
    public static void main(String[] args)
     { 
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
             for (int i = 0; i < n; i++) {
                for(int j=0;j<n;j++)
                {
                    if(arr[j]>arr[i])
                    {
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
                    }
                }
                    }
                         System.out.println("The sortd array is::");
                  for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
                  }
             System.out.println();
      System.out.print("Enter the element to search :: " ) ;
int k=sc.nextInt();

int low=0;
int high=n-1;
boolean found=false;
while(low<=high)
{
    int mid=(low+high)/2;
if(k==arr[mid])
{
 System.out.print("Element found at ::"+(mid+1) +"  position");
found=true;
break;
}
else if (k<arr[mid])
{
high=mid-1;
}
   else
{
    low=mid+1;
}

   }
if(!found)
{
     System.out.print("ELEMENT NOT FOUND");
}

     }
    }

