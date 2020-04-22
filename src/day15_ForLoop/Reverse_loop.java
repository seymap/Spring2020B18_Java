package day15_ForLoop;

public class Reverse_loop {

    public static void main(String[] args) {
        String str ="java";

        String reverse1=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        int lastindex =str.length()-1;
       String reverse2="";
        for(int i=lastindex;i>=0;i--){
            reverse2+=str.charAt(i);
            System.out.println(str.charAt(i));
        }
    }
}
