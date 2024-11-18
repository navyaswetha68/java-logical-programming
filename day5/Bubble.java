import java.util.Scanner;

class Bubble {
    public static void main(String args[]) {
        Scanner mn = new Scanner(System.in);
        int n, i, j, t;

        // Input array size
        System.out.println("Enter Array size:");
        n = mn.nextInt();
        int a[] = new int[n];

        // Input array elements
        System.out.println("Enter the Array elements:");
        for (i = 0; i < n; i++) {
            a[i] = mn.nextInt();
        }

        // Display elements before sorting
        System.out.println("The elements before sorting are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        // Bubble Sort algorithm
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) { // Inner loop to perform the comparisons
                if (a[j] > a[j + 1]) {
                    // Swap the elements
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        // Display elements after sorting
        System.out.println("The elements after sorting are:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        // Close the scanner
        mn.close();
    }
}