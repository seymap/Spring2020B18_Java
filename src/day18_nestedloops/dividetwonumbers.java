package day18_nestedloops;

public class dividetwonumbers {
    public static void main(String[] args) {
        int a = 19;
        int b = 3;
        int count=0;
        while (a >= b) {
            a-=b;
            count++;
        }
        if (a==0){
        System.out.println("the result is "+count);

    }else{
            System.out.println("the result is "+ count +" with remainder "+a);
        }
}}