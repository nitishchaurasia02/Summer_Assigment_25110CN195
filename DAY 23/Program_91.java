import java.util.*;
public class Program_91 {
    public static void main(String[] args) {
        int F=0,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        System.out.print("Enter another  string: ");
        String v = sc.nextLine().toLowerCase();
        s=s.replace(" ","");
        v=v.replace(" ","");
        if(s.length()!=v.length())
        {
        System.out.print("Not Anagram");
        }
    else {
            char[] arrayS = s.toCharArray();
            char[] V = v.toCharArray();

            Arrays.sort(arrayS);
            Arrays.sort(V);
            if (Arrays.equals(arrayS, V)) {
                System.out.print("Anagram");

            } else {
                System.out.println(" Not Anagram");
            }
        }
    System.out.println();
    }
    }
