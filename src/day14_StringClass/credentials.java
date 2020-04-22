package day14_StringClass;

import java.util.Scanner;

public class credentials {

    public static void main(String[] args) {

        String Validusername = "cybertek";
        String validpassword = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("enter your username: ");
        String inputuser = input.next();
        System.out.println("enter your password: ");
        String inputpaass = input.next();
        if(inputuser.equals(Validusername) && inputpaass.equals(validpassword)) {
            System.out.println("login success");
            } else {
                System.out.println("sorry not correct");

            }


        }

    }
