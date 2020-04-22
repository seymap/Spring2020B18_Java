package day13_StringClass;

import java.util.Scanner;

public class shoppingInfo {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("enter your nuilding number: ");
        String build =input.next();

        input.nextLine();
        System.out.println("enter your street address: ");
        String street =input.nextLine();

        System.out.println("enter your city name:");
        String cityname = input.next();

        System.out.println("enter your state");
    }
}
