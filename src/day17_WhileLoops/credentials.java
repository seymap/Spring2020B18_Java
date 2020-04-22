package day17_WhileLoops;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your username" );
        String username = input.next();
        System.out.println("enter your password");
        String password = input.next();
        while (!username.equals("cybertek") && !password.equals("cybertek123")){
            System.out.println("plese re enter credentials");
            System.out.println("re enter username");
            username =input.next();
            System.out.println("renter password");
            password = input.next();

        }
        System.out.println("logged in");
    }
}
