package day20_ArraysContinue;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {

        String[] days={"mon","tue","wed","tues","fri","sat","sun"};

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number" );
        int num=input.nextInt();

        if (num>7||num<=0){
            System.out.println("invalid entry");
            System.out.println("re-enter");
           num=input.nextInt();
        }
       String result= days[num-1];
        System.out.println(result);

    }
}
