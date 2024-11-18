import java.util.Scanner;

public class Maxmin 
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
        int[] maxMin = findMaxMin(numbers);
        System.out.println("The maximum element is: " + maxMin[0]);
        System.out.println("The minimum element is: " + maxMin[1]);
    }

    public static int[] findMaxMin(int[] array) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : array) 
        {
            if (number > max) 
            {
                max = number; 
            }
            if (number < min) 
            {
                min = number;
            }
        }

        return new int[]{max, min}; 
    }
}