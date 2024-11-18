import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
 
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int duplicateCount = countDuplicates(array);

        System.out.println("Total number of unique duplicate elements: " + duplicateCount);

    }

    public static int countDuplicates(int[] array) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        int count = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > 1) {
                count++;
            }
        }

        return count;
    }
}