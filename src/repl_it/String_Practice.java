package repl_it;

import java.util.Scanner;

public class String_Practice {

    public static void main(String[] args) {
        String firstname ="max alan";
        String secondname = "alan taylor";

        Scanner input = new Scanner(System.in);
        System.out.println("enter your first fullname");
        String name = input.nextLine();
        System.out.println("enter second name");
        String name1 = input.nextLine();
        boolean validname =firstname.equals(name) && secondname.equals(name1);
        if(validname){
            System.out.println("valid");
        }else{
            System.out.println("not found");
        }









        }


    }


