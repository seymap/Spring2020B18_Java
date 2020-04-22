package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {

     boolean coldWather = true;
     if(coldWather){

         System.out.println("Wear your hat");
         System.out.println("Wear your jacket");


     }

      boolean coronaDEt = true;
     if(coronaDEt){
         System.out.println("buy more ");
         System.out.println("buy more water");


     }

        System.out.println("================================================================");



     int a = 200;
     boolean evenNumber = a % 2==0;
    // boolean oddNumber = a

     if(evenNumber){

         System.out.println(a+" is even number");
     }

     if(!evenNumber){

         System.out.println(a + " is odd number ");
     }






    }
}
