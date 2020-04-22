package repl_it;

import java.util.Scanner;

public class reprep {
    public static void main(String[] args) {


    }

    public static void person(String info) {
        String firstname = info.substring(0,info.indexOf(","));
        info=info.replaceFirst(",","");

        String lastname=info.substring(info.indexOf(" ")+1,info.indexOf(","));
        String age=info.substring(info.indexOf(",")+1,info.length());

        System.out.println("person name: "+firstname+"last name: "+lastname+"age: "+age);



    }
}
