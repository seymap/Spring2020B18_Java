package day17_WhileLoops;

public class FINRA {
    public static void main(String[] args) {
        for (int a = 1; a <= 30; a++) {
             if (a % 3 == 0 && a % 5 == 0) {
                 System.out.print("FINRA");

             }else if (a % 3 == 0) {
                System.out.print("FIN");
            }
            else if (a % 5 == 0) {
                System.out.print("RA");

            } else{
                System.out.print(a);
            }
        }
    }

}
