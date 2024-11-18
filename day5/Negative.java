class Negative
{

    public static void main(String[] args) 
    {
        int[] arr = {-1, 18, -30, 223, -50, 0, -121, 3};

        System.out.println("Negative elements in the array:");
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < 0) 
            {
                System.out.println(arr[i]);
            }
        }
    }
}