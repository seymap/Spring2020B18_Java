package day10_Switch_Scanner;

public class dayInmounth {


    public static void main(String[] args) {
        int num = 11;
         String result ="";

        boolean days28= num==2;
        boolean days30= num==4 || num==6 || num==9 || num==11;
        if (num>0 && num<13){

             result = (days28)? "has 28 days" : (days30)? "has 30 days": "has 31 days";


        }else{

            result= "invalid";
        }

        System.out.println(result);
    }
}
