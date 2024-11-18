import java.util.Scanner;

class Char
{
    public static void main(String[] args) 
    {
        
        Scanner mn = new Scanner(System.in);
        String input;
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        System.out.print("Enter a string: ");
        input = mn.nextLine();

        

        for (char ch : input.toCharArray()) 
        {
            if (Character.isLetter(ch)) 
            {
                alphabetCount++;
            } 
            else if (Character.isDigit(ch)) 
            {
                digitCount++;
            } 
            else if (!Character.isWhitespace(ch)) 
            {
                specialCharCount++;
            }
        }
        System.out.println("Total number of alphabets: " + alphabetCount);
        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Total number of special characters: " + specialCharCount);
        }
}