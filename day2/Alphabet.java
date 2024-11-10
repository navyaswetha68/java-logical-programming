import java.util.Scanner;

public class Alphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch='u';

        System.out.print("Enter an alphabet: ");
        sc.next().charAt(0);

               

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("the given alphabet is a vowel.");
        } 
                else{

            System.out.println("the given alphabet is a consonant.");
        } 
                        sc.close();
    }
}