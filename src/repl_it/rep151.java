package repl_it;
import java.util.*;

public class rep151 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        int count=0;
        for (int each:nums){
            count=0;
        for (int k=0; k<nums.length;k++){
            if (each==nums[k]){
                count++;
            }

        }
        if (count==1){
            System.out.println(each);
        }
        }

    }
}