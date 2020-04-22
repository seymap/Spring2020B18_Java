package day09_nestedif.ternary;

public class ternary_practice {
    public static void main(String[] args) {
        int num =100;
        char vhr = (num>0)? '+' : (num<0)?'_' : '0';
        System.out.println(vhr);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        byte score = 50;
        String grade = (score>90)? "a" : (score<80 && score>70)? "b" : (score >55 && score <75)? "g" : "dfr";
        System.out.println(grade);


    }
}
