import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sno,sub1,sub2,sub3,total;
        String sname;
        float savg;
        System.out.println("Enter Student Number: ");
        sno = sc.nextInt();
        System.out.println("Enter Student Name: ");
        sname = sc.next();
        System.out.println("Enter marks for physics: ");
        sub1 = sc.nextInt();

        System.out.println("Enter marks for chemistry: ");
        sub2 = sc.nextInt();

        System.out.println("Enter marks for maths: ");
        sub3 = sc.nextInt();
        total = sub1 + sub2 + sub3;
        savg = total / 3;

        System.out.println("\nStudent Report:");
        System.out.println("Student Number: " + sno);
        System.out.println("Student Name: " + sname);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + savg);

        sc.close();
    }
}