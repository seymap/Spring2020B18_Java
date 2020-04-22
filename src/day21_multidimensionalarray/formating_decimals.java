package day21_multidimensionalarray;

public class formating_decimals {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        for (int eachElement : nums){
            System.out.println(eachElement);
        }
String [] names={"ali","ayse","layla"};
        for (String eachStudent : names){
            System.out.println(eachStudent);
        }
        int []arr1={1,2,3,4,5,6,7,8,9,10};
        for (int each : arr1){
            if (each>5){
                continue;


            }

            System.out.println(each);
        }
        String words="i love my family";
        String [] word=words.split(" ");
        for (String eachw : word){
            System.out.println(eachw);
        }
        for (int i=word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }



    }

}
