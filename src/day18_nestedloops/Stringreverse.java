package day18_nestedloops;

public class Stringreverse {
    public static void main(String[] args) {
        String str = "i like java";
        String rev="";
        int lastindex = str.length()-1;

        do {

           rev+= str.charAt(lastindex);
            lastindex--;

        }while (lastindex>=0);
        System.out.println(rev);



    }
}
