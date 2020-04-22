package repl_it;

import java.sql.SQLOutput;
import java.util.Scanner;

public class giftcard {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("can you enter your item");
        String item =input.next();


        int giftcard = 100;
       int hat = 99;
       int pants = 75;
       int laptops= 1000;
       int cupcake =25;

String total=(giftcard>=hat)? "thank you":(pants<giftcard)?"hjdk":"cupcake";
        System.out.println(total);
       }
    }

