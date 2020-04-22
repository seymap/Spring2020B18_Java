package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter salary: ");
        int salary = input.nextInt();

        input.nextLine();
        System.out.println("enter your full name:");
        String fullname= input.nextLine();


        System.out.println("enter your company name: ");
        String companyname = input.nextLine();


        System.out.println("enter your SSN: ");
        int SSN = input.nextInt();

        System.out.println("enter your job title: ");
        String jobtitle =input.next();






    }
}
