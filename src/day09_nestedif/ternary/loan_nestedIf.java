package day09_nestedif.ternary;

public class loan_nestedIf {
    public static void main(String[] args) {
        double salary = 120000;
        byte workhistory = 3;

        if(salary >= 30000){
            if (workhistory > 2) {
                System.out.println("you are eligible");
            }else {
                System.out.println("you need to work more than 2 years");
            }
            }

         else {
            System.out.println("you must earn 30000");

        }
    }
}
