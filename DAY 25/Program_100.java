import java.util.*;

public class Program_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.split("\\s+");

        Arrays.sort(words, new Comparator<String>() {

            public int compare(String w1, String w2) {
                return w1.length() - w2.length();
            }
        });

        System.out.println("\nWords sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}