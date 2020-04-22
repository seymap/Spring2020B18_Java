package repl_it;

public class odevp {
    public static void main(String[] args) {

        for (char z = 'z'; z >= 'a'; z--) {

            for (char ch = 'a'; ch <= z; ch++) {  //  'a' >= 'a'
                System.out.print(ch + " ");
            }
            System.out.println();

        }
    }}