package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String fulladres="";

        System.out.println("enter the no apt: ");
        short Bnumber = scan.nextShort();
        fulladres += Bnumber+ " ";

        System.out.println("enter the street name: ");
        String streetname = scan.next();
        fulladres += streetname+" ";

        System.out.println("enter the typeof the road");
        String roadTyppe =scan.next();
        fulladres += roadTyppe+", ";

        System.out.println("enter city name, state, zipcode");
        String cityname =scan.next();
        fulladres += cityname+" ";

        String state = scan.next();
        fulladres += state +", ";

        int zipcode = scan.nextInt();
        fulladres += zipcode;

        System.out.println("adres is: "+ fulladres);
    }

}
