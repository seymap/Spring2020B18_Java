package repl_it;

import java.util.Scanner;

public class Practice_String {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");


        System.out.println("your answer is: ");
        String answer = s.nextLine();
         boolean answers = answer == "a"&& answer=="b"&&answer=="c";

        if (answer == "a"){
            System.out.println("a is wrong answer ");

        }else if (answer=="b"){
            System.out.println("b is correct");

        }else if(answer=="c"){
            System.out.println("c is wrong answer");
        }else{
            System.out.println("z is not a valid answer");

        }


    }

}