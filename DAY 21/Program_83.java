import java.util.*;
public class Program_83 {
    public static void main(String[] args) {
        int v=0,c=0;
        String s = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();
        int l=s.length();
        s=s.toLowerCase();
for(int i=0;i<l-1;i++) {
    char ch = s.charAt(i);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        v++;
    } else if (ch >= 'a' && ch <= 'z') {
        c++;
    }
}System.out.print("Number of consonants are ::");
        System.out.print(c);
        System.out.println();
        System.out.print("Number of Vowels Are :: ");
        System.out.print(v);

    }
}