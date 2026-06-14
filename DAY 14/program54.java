import java.util.*;
public class program54
{
    public static void main(String[]args)
{
    int f=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("How many elements do you want to enter:: ");
    int n=sc.nextInt();
    System.out.print( "Enter "+n+  " elements ::");
   
      int arr[]=new int[n];
      for(int i=0;i<n;i++)                 
      {
        arr[i]=sc.nextInt();
      }
        System.out.println();
      System.out.println("THE ENTERED ARRAY IS::");
       for(int i=0;i<n;i++)                 
      {  
  System.out.print(arr[i]  +" ");

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
System.out.println("Frequency of the element " +arr[i]+ " is "+f);
      }
    }
}