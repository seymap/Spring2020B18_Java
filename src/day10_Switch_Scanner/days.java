package day10_Switch_Scanner;

public class days {

  /*  2. write a program that can display the days based on the numbers 1 ~ 7
  MUST USE NESTED IF*/

    public static void main(String[] args) {
        int num =6;
        String result="";

        if(num>=1 &&  num<8){

           result=(num==1)? "monday" :(num==2)? "tuesday" :(num==3)? "wednesday" :(num==4)? "thursday" :(num==5)? "friday" :(num==6)? "saturday" : "sunday";


        }else{
           result = "invalid";
        }

        System.out.println(result);
    }

}
