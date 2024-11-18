import java.util.Scanner;

class Linear 
{
    public static void main(String args[]) 
    {
        Scanner mn = new Scanner(System.in);
        int n, i, ser;

       
        System.out.println("Enter Array size:");
        n = mn.nextInt();
        int a[] = new int[n];

       
        System.out.println("Enter the Array elements:");
        for (i = 0; i < n; i++) 
        {
            a[i] = mn.nextInt();
        }

        
        System.out.println("The elements in the array are:");
        for (i = 0; i < n; i++) 
        {
            System.out.println(a[i]);
        }

        
        System.out.println("Enter the value to search:");
        ser = mn.nextInt();
        
        for (i = 0; i < n; i++) 
        {
            if (ser == a[i]) 
            {
                System.out.println(ser + " is found at index " + i);
             
                break; 
            }

    
            if (i==n) 
            {
              System.out.println(ser + " not found");
            }
        }
    }
}