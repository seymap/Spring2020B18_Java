package repl_it;

import java.util.Scanner;

public class inputPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("your first name: ");
        String firstname =input.next();

        System.out.println("your last name: ");
        String lastname = input.next();

        String fullname = (firstname+" "+lastname);

        System.out.println("your full name is: "+ fullname);
        String fullnamed = input.nextLine();




    }
}
