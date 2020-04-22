package day18_nestedloops;

public class do_while_3 {
    public static void main(String[] args) {
        int num = 0;
        do {

            if(num%2==0){
                System.out.print(num+" ");
            }

            num++;
        }while (num<=100);
        System.out.println("======================================");


        int i= 1;
        do {

            i++; ///////////bu ;ekilde yazilirsa 2 den baslar ama system out tan sonra yaxilirsa 1 den baslar 
            System.out.println(i);
        }  while (i<=5);
        }
    }

