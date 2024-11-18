import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Total vowels: " + counts[0]);
        System.out.println("Total consonants: " + counts[1]);
    }
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }
}