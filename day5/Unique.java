import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Unique
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n <= 0) 
        {
            System.out.println("Array must contain at least one element.");
            return;
        }

        int[] array = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = scanner.nextInt();
        }

       
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int element : array) 
        {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

      
        System.out.println("Unique elements in the array:");
        boolean hasUniqueElements = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) 
        {
            if (entry.getValue() == 1) 
            {
                System.out.print(entry.getKey() + " ");
                hasUniqueElements = true;
            }
        }

        if (!hasUniqueElements) 
        {
            System.out.println("No unique elements found.");
        } else {
            System.out.println(); 
        }
    }
}