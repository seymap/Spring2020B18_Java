package repl_it;

import java.util.Scanner;

public class nweReplit91 {
    public static void main(String[] args) {







        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str.toLowerCase();
        int count=0;
        while (str.contains("hi")==true) {
            str=str.replaceFirst("hi", "");
            count++;
        }
        System.out.println(count);



          }

      }



