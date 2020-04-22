package Aday25_MethodsRecap;
import Resources.Library;
public class testt {
    public static void main(String[] args) {
        String str="ABCDABAABCDBCD";
        String result=Library.Reverse(str);
        System.out.println(result);


        String str1="AABBCDEB";
        String str2="B";
        int num1=Library.Frequency(str1,str2);
        System.out.println(num1);

    }
}
