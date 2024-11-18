import java.util.Scanner;

class Copy
{
    public static void main(String[] args) 
    {
        Scanner mn = new Scanner(System.in);
        int i,n;
        System.out.print("Enter the number of elements in the array: ");
        n = mn.nextInt();
        if (n <= 0) 
        {
            System.out.println("Array must contain at least one element.");
            return;
        }
        int[] originalArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) 
        {
            originalArray[i] = mn.nextInt();
        }
        int[] copiedArray = new int[n];
        for ( i = 0; i < n; i++) 
        {
            copiedArray[i] = originalArray[i];
        }
        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("Copied Array:");
        printArray(copiedArray);

    }
    public static void printArray(int[] array) 
    {
        for (int element : array) 
        {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}   