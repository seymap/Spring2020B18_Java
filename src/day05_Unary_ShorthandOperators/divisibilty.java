package day05_Unary_ShorthandOperators;

public class divisibilty {

    public static void main(String[] args) {

/*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
			Ex:
				number = 65;  ==> int				divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisbileBy5 ==> true/false
				output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true				number = 80;
				output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true
 */

     int number =65;
     boolean divisibleBy2 = number % 2 == 0;
     boolean divisibleBy3 = number % 3 ==0;
     boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number +" is divisibleBy2: " + divisibleBy2);
        System.out.println(number +" is divisibleBy3: " + divisibleBy3);
        System.out.println(number +" is divisibleBy5: " + divisibleBy5);


       String results1 = number +" is divisible By 2: " + divisibleBy2;
        String results2 = number +" is divisible By 3: " + divisibleBy2;
        String results3 = number +" is divisible By 5: " + divisibleBy2;

        System.out.println(results1+ "\n" + results2 + "\n" + results3);


    }



}
