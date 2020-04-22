package Aday25_MethodsRecap;



public class WarmUpMine {
    public static void main(String[] args) {


        String str = "ABAB";
        System.out.println(removeduplicates(str));

    }
    public static String removeduplicates(String str) {
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }

        }
       return result;

    }
}
