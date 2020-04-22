package day09_nestedif.ternary;

public class ternary_practice2 {
    public static void main(String[] args) {
 int num1 = 100;
 int num2 = 200;
 int min = (num1<num2)? num2 : num1 ;
        System.out.println(min);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
         int hour = 14;
         String result = (hour< 12) ? "good morning" : ( hour > 12 && hour <18 )?  "good night": "good fternoon";
        System.out.println(result);
        System.out.println("__________________________________________________________" );
        int no = 12000;
        boolean divisibleby3and5 = (no % 3 ==0 && no % 5 ==0)? true :false;
        System.out.println(divisibleby3and5);
        System.out.println("((((((((((((((((((((((()))))))))))))))))))))))))))))))))))");

    }
}
