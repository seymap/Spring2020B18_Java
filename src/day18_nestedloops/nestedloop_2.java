package day18_nestedloops;

public class nestedloop_2 {
    public static void main(String[] args) {
        for (int b=10; b>=1; b--){
            for (int a =1; a <=b; a++){
                System.out.print("* ");

        }
            System.out.println();

        }
        for (char ch = 'a'; ch<='z'; ch++){
            for (char z = 'a'; z<=ch; z++){
                System.out.print(z +" ");
        }
        System.out.println();
    }
}}
