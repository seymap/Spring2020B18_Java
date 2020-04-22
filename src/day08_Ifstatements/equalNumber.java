package day08_Ifstatements;

public class equalNumber {



    /*  write a program that can check the equality of the three given numberrs
    declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal	2.. write a program that can find the number of days in a month
            (Assume that Feb has 28 days)

   */

    public static void main(String[] args) {

        double n1 =100.5;
        double n2 = 200.5;
        double n3 = 300.5;

        boolean n1eq2 = n1==n2 && n1 !=n3;
        boolean n1eq3 = n1==n3 && n1 !=n2;
        boolean n2eq3 = n2==n3 && n2!= n1;
        boolean alleq = n1==n2 && n1==n3;
        boolean noneofthemeq = n1 != n2 && n1!= n3 && n2 != n3 ;

       // boolean noneeq = n1eq2== false &&n1eq3 == false && n2eq3 ==flase

         if(n1eq2){
             System.out.println(n1+ " is equal to "+n2);
         }
          if(n1eq3){
              System.out.println(n1+ " is equal to "+n3);
          }
          if(n2eq3){
              System.out.println(n2+ " is equal to "+n3);
          }
          if(alleq){
              System.out.println(n1+","+n2+ " is equal to "+n3);
          }
            else{
              System.out.println("none of them are equal");
          }


    }
}
