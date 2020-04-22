package day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner bela = new Scanner(System.in);
        System.out.println("enter your first number: ");
                byte num1 = bela.nextByte();
        System.out.println("enter your second number: ");
                 byte num2       =bela.nextByte();
                 int total= (num1+num2);
        System.out.println("the sum of those two numbers are: "+total);

    }

}
