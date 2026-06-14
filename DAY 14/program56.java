import java.util.*;

public class program56 {
    public static void main(String[] args)
     { 
        int f=0;
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
        boolean v[]=new boolean [n];
  for(int i=0;i<n;i++)                 
      {  
        if(v[i]==true)
        {
            continue;
        }

        f=0;
         for(int k=0;k<n;k++)                 
      {  
      if ( arr[k]==arr[i])
      {
        f++;
    v[k]=true;
}
      }
      if(f>1)

{        System.out.println("Duplicates  of the element " +arr[i]+ " is found "+f +"  times");
      }
      else 
      System.out.println("No Dupicates found for "+arr[i]);
    }
}
}  
