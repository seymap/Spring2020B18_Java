package day18_nestedloops;

import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        int result = 1;
        while (num>=1){
            result = result*num;
            num--;
        }
        System.out.println(result);
    }
}
