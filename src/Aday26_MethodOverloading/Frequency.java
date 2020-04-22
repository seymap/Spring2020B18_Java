package Aday26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {

        String str2 = "AAA";
        char ch2 = 'A';
       int num1= frequency(str2,ch2);
        System.out.println(num1);
    }
    public static int frequency(String str,char ch) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
