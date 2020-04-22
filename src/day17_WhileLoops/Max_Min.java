package day17_WhileLoops;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         int maxnumber = -99999999;
         int minnumber = 99999999;
        for(int i=1;i<6;i++){
            System.out.println("enter a number");
            int num=input.nextInt();
            if (num>maxnumber){
                maxnumber = num;

            }if (num<minnumber){
                minnumber=num;
            }

        }
        System.out.println(maxnumber);
        System.out.println(minnumber);

    }
}
