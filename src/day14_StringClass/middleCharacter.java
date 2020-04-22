package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word");
        String word = input.next(); // cyber

        String middlecha = "";

        int totalcha =word.length();
        int midnumber =totalcha/2; //5/2==>2
        if(totalcha%2 !=0){
            middlecha +=middlecha+ word.charAt(midnumber);


        }
        System.out.println(middlecha);
    }

}
