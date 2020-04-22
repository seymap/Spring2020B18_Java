package repl_it;

import java.util.Scanner;

public class Scanner_Practices {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("welcome to grater");
        System.out.println("enter your class1 name:");
        String class1 = scan.next();
        System.out.println("enter your class1 grade: ");
        double class1grade = scan.nextDouble();

        System.out.println("enter your class2 name");
        String class2 =scan.next();

        System.out.println("enter your class2 grade");
        double class2grade =scan.nextDouble();

        System.out.println("enter your class3 name: ");
        String class3 =scan.next();

        System.out.println("enter your class3 grade: ");
        double class3grade = scan.nextDouble();

        System.out.println("enter your class4 name: ");
        String class4 =scan.next();

        System.out.println("enter your class4 grade: ");
        double class4grade = scan.nextDouble();

        System.out.println("enter your class5 name: ");
        String class5 =scan.next();

        System.out.println("enter your class5 grade: ");
        double class5grade = scan.nextDouble();

        double average =  (class1grade+class2grade+class3grade+class4grade+class5grade) / 5;

        System.out.println("summary: "+class1+" - "+class1grade+" "+class2+" - "+class2grade+" "+class3+" - "+class3grade+" "+class4+" - "+class4grade+" "+class5+" - "+class5grade);
        System.out.println("your avarage score is: " + average);
        System.out.println("thank you for using grader!");
        System.out.println("goodbye!");







    }
}
