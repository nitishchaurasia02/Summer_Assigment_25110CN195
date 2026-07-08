import java.util.*;
public class Program_98 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> commonChars = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!uniqueChars.add(ch)) {
                commonChars.add(ch);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Common/Repeated characters: " + commonChars);
    }
}