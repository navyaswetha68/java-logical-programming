import java.util.Scanner;
class Total 
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
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) 
        {
            if (number % 2 == 0) 
            {
                evenCount++;
            } else 
            {
                oddCount++;
            }
        }
        System.out.println("Total even elements: " + evenCount);
        System.out.println("Total odd elements: " + oddCount);
    }
}