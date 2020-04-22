package day11_Scanner;

import java.util.Scanner;

public class salaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your salary: ");
        int salary = scan.nextInt();

        System.out.println("what's your state tax: ");
        int tax = scan.nextInt();
        double statetaxPercentage = tax / 100.0;

        System.out.println("enter the federal tax: ");
        byte fedtax=scan.nextByte();
        double fedtaxPercentage = fedtax /100.0;

        double totalTax = (fedtaxPercentage+statetaxPercentage) * salary;

        double afterTaxSalary = salary -totalTax;
        System.out.println("your salary after tax is; "+afterTaxSalary);
        System.out.println("total tax; $"+totalTax);



    }

}
