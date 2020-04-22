package day05_Unary_ShorthandOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = +a;
        System.out.println(a);
        System.out.println(b);



        int a2 = -10;
        boolean res1 = a2>0;
        boolean res2 =a2<0;


        System.out.println(res1);
        System.out.println(res2);

        int x1 = -10;
        int y1 = -x1;


        System.out.println(y1);


        int x2 = +20;
        int y2 = -x2;
        System.out.println(y2);






    }


}
