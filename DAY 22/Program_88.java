import java.util.*;
public class Program_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.print("Enter a string :: " + s);
        s=sc.nextLine();
        String result = s.replace(" ", "");
        System.out.print("Space Removed String :: " + result);
    }
}