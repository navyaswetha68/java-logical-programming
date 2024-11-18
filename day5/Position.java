import java.util.Scanner;

class Position 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the position of the element to delete (0 to " + (n - 1) + "): ");
        int position = scanner.nextInt();
        if (position < 0 || position >= n) {
            System.out.println("Invalid position! Please enter a position between 0 and " + (n - 1) + ".");
            return;
        }
        int[] newArray = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != position) {
                newArray[j++] = array[i];
            }
        }
        System.out.println("Array after deletion:");
        printArray(newArray);
    }
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); 
    }
}