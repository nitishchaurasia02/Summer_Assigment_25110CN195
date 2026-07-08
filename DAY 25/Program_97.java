import java.util.*;
import java.util.stream.IntStream;
public class Program_97
{
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want to enter? ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.print("Entered array is: ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);

        System.out.println();

        System.out.print("How many elements do you want to enter in 2nd array? ");
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
        Arrays.sort(arr2);
        System.out.println();
        int[] arr3 = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();

        Arrays.sort(arr3);
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

    }
    }
