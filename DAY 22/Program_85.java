import java.util.*;
public class Program_85 {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        int l = s.length();
        String f="";
        System.out.print("Reverse of the  string: ");
        for (int i = l - 1; i >= 0; i--) {
            f = f + s.charAt(i);
        }
        System.out.print(f);

        if(s.equals(f))
    {
        System.out.println("------Pallindrome String");
    }
        else
    {
        System.out.println("---Not Pallindrome");
    }

}
}