package day13_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        String str = "cybertek";

        char ch1 = str.charAt(5);
        System.out.println(ch1);

        System.out.println(ch1=='t');
int totalLenght =str.length();
        System.out.println(totalLenght);

        System.out.println(totalLenght>250);// false

        String str2 ="today is a great day, java is fun";
        int maxNum =str.length();
        System.out.println(maxNum);

        String s1 = "cybertek";
        s1 = s1.concat(" school");
        System.out.println(s1);

        String s2 ="java";
        s2 = s2.concat(" is a programming language");

        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);


        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();
        System.out.println(name1);

        String name2 ="cybertek school";
        name2 = name2.toUpperCase();
        System.out.println(name2);

        String A1 ="      Today is  great day";
        A1= A1.trim();
        System.out.println(A1);




    }
}
