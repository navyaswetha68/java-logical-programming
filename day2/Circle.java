import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int radius;
       float PI=3.14F;
       float area;

                System.out.print("Enter the radius of the circle: ");
                radius = sc.nextInt();
                area = PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
                sc.close();
    }
}