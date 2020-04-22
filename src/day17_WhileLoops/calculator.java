package day17_WhileLoops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter first number");
        int num = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();
        System.out.println("enter operator");
        String operator= input.next();
        if (operator.equals('+')){
            System.out.println("addition is: ");

        }else if(operator.equals('-')){
            System.out.println("subtraction is: ");
        }

    }
}
