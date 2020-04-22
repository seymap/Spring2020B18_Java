package day10_Switch_Scanner;
import java.util.Scanner;
public class ScannerTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter salary: ");
        int salary = input.nextInt();

        System.out.println(" how many hours your works in a week: ");
        int week =input.nextInt();

        System.out.println("the hourly rate: "+salary/week);

    }
}
