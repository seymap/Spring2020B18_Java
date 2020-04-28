package repl_it;
import java.util.*;
public class rep154 {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            isPalindrome(num);
        }

        public static void isPalindrome(int num){
            //WRITE YOUR CODE HERE
           String numstr=""+num;
           String numstr2="";
           for (int k=numstr.length()-1;k>=0;k--){
               numstr2+=numstr.charAt(k);
           }
            System.out.println(numstr2.equals(numstr));
        }

}
