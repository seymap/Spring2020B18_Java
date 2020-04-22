package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("enter your age: ");
        int age = input.nextInt();
        System.out.println("your ageis: "+age);

        input.nextLine();

        System.out.println("enter your full name: ");
        String fullname =input.nextLine();

        System.out.println("your full name is: "+fullname);


    }


}
