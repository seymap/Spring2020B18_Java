package repl_it;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("enter item1 and its price: ");
        String item1 =scan.next();
        double itemprice1 =scan.nextDouble();

        System.out.println("enter item2 and its price: ");
        String item2 =scan.next();
        double itemprice2 =scan.nextDouble();

        System.out.println("enter item2 and its price: ");
        String item3 =scan.next();
        double itemprice3 =scan.nextDouble();

        String total = (item1+": "+itemprice1+", "+item2+": "+itemprice2+", "+item3+": "+itemprice3);
        double totalprice = itemprice1+itemprice2+itemprice3;

        System.out.println(total);
        System.out.println("totalprice is: "+totalprice);






    }
}
