package repl_it;
import java.util.*;
public class rep155 {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            fib(num);
        }

        public static void fib(int num){
            //WRITE YOUR CODE HERE

            int [] fib=new int[num+1];
            fib [0]=0;
            fib [1]=1;
            for (int i=2;i<=num;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
        }
    }

