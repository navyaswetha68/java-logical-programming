import java.util.Scanner;

class Countnegative
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int n,i;
        System.out.print("Enter the number of elements in the array: ");
        n = mn.nextInt();
        if (n <= 0) 
        {
            System.out.println("Array must contain at least one element.");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) 
        {
            numbers[i] = mn.nextInt();
        }
        int negativeCount = 0;

        for (int number : numbers) 
        {
            if (number < 0) 
            {
                negativeCount++; 
            }
        }
        System.out.println("Total negative elements: " + negativeCount);
    }
}