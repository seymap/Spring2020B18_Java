package day20_ArraysContinue;



import java.util.Arrays;

public class arrays_sorting {
    public static void main(String[] args) {

        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("first min number is: " + arr1[0]);
        System.out.println("first max number is: " + arr1[arr1.length - 1]);
        System.out.println("third max number is: " + arr1[arr1.length - 3]);


        char[] ch = {'Z', 'D', 'W', 'Y', 'A', 'B', 'E', 'D'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
    }


}