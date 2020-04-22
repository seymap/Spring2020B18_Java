package day07_IfStatements;

public class If_else_statement {

    public static void main(String[] args) {

   /*     int number = 0;
        if(number >= 0){
            System.out.println(number );


        }
        if(number >= 0){

        }
*/

   int num = 100;
   if(num % 2== 0);{
            System.out.println(num+ " is even num");
        }
        if(num % 2 !=0){
            System.out.println(num+ " is odd number");
        }


        boolean evenNum = num % 2== 0;
        if (evenNum) {
            System.out.println(num + " is even number");
        }
        else{
            System.out.println(num + " is odd number");
        }
        }

    }

