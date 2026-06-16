import java.util.*;
public class program62 {
    public static void main(String[] args)
     { 
        int F=0,f=0;
        int b=0;
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
        boolean v[]=new boolean [n];
  for(int i=0;i<n;i++)                 
      {  
        if(v[i]==true)
        {
            continue;
        }

        f=0;
         for(int k=i;k<n;k++)                 
      {  
      if ( arr[k]==arr[i])
      {
        f++;
    v[k]=true;
}
      }
      
      if(f>F)
      {
       
    F=f;
    b=arr[i];
      }
    }
     System.out.println("Element with highest frequency is " +b+ " and frequency is "+F);

}
}