package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Nextline_prctice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("builder number: ");
        int Bnumber =input.nextInt();

        System.out.println("bulilding number is: "+ Bnumber);

        input.nextLine();

        System.out.println("street: ");
        String street = input.nextLine();
        System.out.println("street is: "+ street);

        System.out.println("Enter the zip code: ");
        int zip = input.nextInt();
        System.out.println("zip code is: "+ zip);

      input.nextLine();

        System.out.println("enter the city name and state seprrated by comma and space");
        String cityState = input.nextLine();

        String fulladdress = Bnumber+ " "+street+", "+ cityState+ " "+ zip;
        System.out.println(fulladdress);


    }
}
