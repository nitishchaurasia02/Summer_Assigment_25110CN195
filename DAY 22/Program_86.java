import java.util.*;
public class Program_86 {
    public static void main(String[] args) {
        String s = "";
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        int l = s.length();
        for (int i = 0; i < l ; i++) {
            char ch = s.charAt(i);
            if ((int) ch == 32) {
                c++;
            }
        }
        System.out.print("Number of words:::"+c);
    }
}