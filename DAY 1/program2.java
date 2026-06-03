import java.util.Scanner;
public class program2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int out;
        int num = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            out = num * i;
            System.out.println(num + " x " + i + " = " + out);
        }
    }
}
