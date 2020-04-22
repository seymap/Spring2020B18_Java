package day14_StringClass;

import java.util.Scanner;

public class comineTwoString {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter first word");
        String words1 =input.next();

        System.out.println("enter second word");
      String word2 =input.next();

      String result=words1.concat(" "+word2).concat(" "+word2).concat(" "+words1);
        System.out.println(result);

    }



}
