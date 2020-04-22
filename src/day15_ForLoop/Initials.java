package day15_ForLoop;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname =scan.next();

        System.out.println("enter your last name");
        String lastname =scan.next();

       /* String initials =firstname.substring(0,1)+lastname.substring(0,1);
        initials=initials.toUpperCase();
        System.out.println(initials);*/

        String initial=""+firstname.charAt(0)+lastname.charAt(0);
        initial=initial.toUpperCase();
        System.out.println(initial);
    }
}
