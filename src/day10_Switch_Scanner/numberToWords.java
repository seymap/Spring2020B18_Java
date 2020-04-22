package day10_Switch_Scanner;

public class numberToWords {

    public static void main(String[] args) {
        int num = 4;
        String word = (num==0)? "zero" :(num==1)? "one":(num==2)? "two":(num==3)? "three" :(num==4)? "four" :(num==5)? "five": "invalid";
        System.out.println(word);


    }

}
