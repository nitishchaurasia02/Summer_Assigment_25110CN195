import java.util.*;
public class Program_81
{
    public static void main(String[]args) {
        String s = "";
       int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        for(char c:s.toCharArray()) {
            count++;
        }

        System.out.print("length of entered string is::");

        System.out.print(count);
    }
}