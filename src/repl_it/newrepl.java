package repl_it;

import java.util.Scanner;

public class newrepl {
    public static void main(String[] args) {

        int age = 8;
        String ageGroup= "";

        if(age>=2 && age<=18){

      String ageGr= (age<=2)? "ineligible" : (age==2)? " toodler": (age<=5 && age>=3)? "early ch": (age>=6 && age<=7)? "young reader" : (age>=8 && age<=10)? "elementary":(age ==11 & age ==12)? "middle" : (age ==13)? "impossible" : (age >=14 && age <=16) ? "high school" : (age >=17 && age <=18)? "scholar" : "ineligible";
            System.out.println(ageGr);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" );


        byte no1 = 12;
        byte no2 =22;
        byte no3 = 32;

        String bigger = (no1>no2 && no1>no3) ? "no1 is bigger" : (no2>no1 && no2>no3)? "no2 is bigger" :  "no3 is bigger";

        System.out.println(bigger);
    }


}
