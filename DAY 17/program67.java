import java.util.*;
public class program67 {
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; 
        System.out.print("How many elements do you want to enter in the first array? ");
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
        System.out.print("How many elements do you want to enter in second array? ");
        int m = sc.nextInt();
        System.out.println("Enter the " + m + " elements:");
        
        int[] arr2 = new int[m]; 
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt(); 
        }
        System.out.print("Entered array is: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(); 
       Set<Integer> set1= new LinkedHashSet<>();
       Set<Integer> set2= new LinkedHashSet<>();
for (int i = 0; i < n; i++) {
            set1.add(arr[i]);
        }
        for (int i = 0; i < m; i++) {
            set2.add(arr2[i]);
        }
        set1.retainAll(set2);
        System.out.print("Intersection of arrays is: " + set1); 
    }
}
      

