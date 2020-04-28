package repl_it;
import java.util.*;
public class rep153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

      int count=0;
        for (String eachstr: words) {
            count = 0;
                for (int k=0;k<words.length;k++)
                if (eachstr.equals(words[k])){
                    count++;

                }


            if (count==1){

                System.out.println(eachstr);
            }
        }

    }
}
