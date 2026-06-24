import java.util.*;
public class Program_82 {
    public static void main(String[] args) {
        String s = "";
        String f="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        int l = s.length();
        System.out.print("Reverse of the  string: ");
        for (int i = l - 1; i >= 0; i--) {
            f = f + s.charAt(i);
        }
        System.out.print(f);
    }
}