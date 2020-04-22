package day05_Unary_ShorthandOperators;

public class PostPre_Practice {

    public static void main(String[] args) {

        int a = 50;
         a = --a + a++ + a-- + a++;
        System.out.println(a);


        int x = 4;
        int y = x* 4 - x++;
        System.out.println(y);




        int ad = 1;
        ad = -ad-- + ad++ / -a-- * --a;
        //   -1      0      -1     -1

        System.out.println(ad);









    }


}
