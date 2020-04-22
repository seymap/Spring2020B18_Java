package day09_nestedif.ternary;

public class ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = "";
        if (num % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        String result2 = (num % 2 == 0) ? "even" : "odd";
        System.out.println("======================================================");
        int num1 = 100;
        int num2 = 200;
        int max = 0;

        int max1 = (num1 > num2) ? num1 : num2;
        System.out.println(max1);
        System.out.println("======================================================");
        String str = "";
        String str1 = (true) ? "hello" : "hi";
        System.out.println("=======================================================");
        int age = 20;

        boolean eligible1 = (age>18)? true : false;
        System.out.println(eligible1);
        System.out.println("=================+++++++++++++++++++++++++++++++");

        int age1= 20;

       String vote = (age1>20)? "yes" : "no";
        System.out.println(vote);
    }
}
