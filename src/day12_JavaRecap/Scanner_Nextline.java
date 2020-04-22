package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Nextline {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("enter some number: ");
        int num = input.nextInt();
        System.out.println(num);

      input.nextLine();

        System.out.println("enter your name");
        String name = input.next();

        System.out.println(name);





    }
}
