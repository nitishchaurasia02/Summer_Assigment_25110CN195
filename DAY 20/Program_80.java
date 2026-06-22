import java.util.*;
public class Program_80 {

    public static void main(String[] args) {
int sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you want to enter array 1? ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n * n + " elements:");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println();
        System.out.print("Entered array is: ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        for (int j = 0; j < n; j++)
        {
            sum=0;
        for (int i = 0; i < n; i++) {

                    sum = sum + arr[i][j];
                }
            System.out.println("Coloumn "+(j+1)+" sum== " + sum);
            }



        }
    }

