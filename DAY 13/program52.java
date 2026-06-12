import java.util.*;
public class program52 {
    
    public static void main(String[] args)
     { 
       int e=0,o=0;
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
      if (arr[i]%2==0)
        e++;
else
    o++;
}
  System.out.println("Number of even elements are:"+e);
     System.out.println("Number of odd elements are:"+o);

}
}