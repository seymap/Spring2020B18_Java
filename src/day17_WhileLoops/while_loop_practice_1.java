package day17_WhileLoops;

public class while_loop_practice_1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int a = 0;
        int sum1 = 0;
        while (a <= 10) {
            if (a % 2 == 0) {

                sum1+=a;

            }
        }
        System.out.println(sum1);//////////////////tekrar bak!!!!!!!!!1
        a++;
    }
}