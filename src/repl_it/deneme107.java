package repl_it;

import java.util.Scanner;

public class deneme107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int evencount=0;

        for (int each : nums) {

            if (each%2==0){

               evencount ++;

            }

        } System.out.println(evencount);

    }
}
