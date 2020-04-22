package repl_it;

public class ternaryPrac {

    public static void main(String[] args) {
       int num1 = 200;
       int num2 = 300;
       int value =(num1>num2)? num1 : (num2>num1)? num2 : num2;
        System.out.println(value);


    }
}
