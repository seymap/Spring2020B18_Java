package day12_JavaRecap;

import java.util.Scanner;

public class SumOfFiveNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter five number" );

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double sum = 0;

        sum = (num1>0)?(num1) : (num2>0)? (num1+num2) :(num3>0)? (num3+num2) : (num3+num4);
        System.out.println("pozitive number "+sum);


    }


}
