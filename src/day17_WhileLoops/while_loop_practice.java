package day17_WhileLoops;

import java.util.Scanner;

public class while_loop_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter yes or no");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");
        while (!valid){
            System.out.println("please re-enter");
        word =input.next();
        if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
            break;
        }
    }

        if (word.equalsIgnoreCase("yes")){
            System.out.println("entered yes");

        }if (word.equalsIgnoreCase("no") ){
            System.out.println("entered  no");
        }
    }
}
