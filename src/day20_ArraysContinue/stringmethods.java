package day20_ArraysContinue;

import java.util.Arrays;

public class stringmethods {
    public static void main(String[] args) {

        String name="seyma";
        char [] characters=name.toCharArray();

        System.out.println(Arrays.toString(characters));

        String str1="Seni Seviyorum";
        String str2="Seviyorum Seni";

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);

        boolean equalstr=Arrays.equals(ch1,ch2);


    }
}
