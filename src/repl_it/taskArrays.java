package repl_it;

public class taskArrays {
    public static void main(String[] args) {
        // print all the odd numbers with regular for loop. MUST use continue statement
       // print all the even number with for each loop. MUST use continue statement
        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

      /*  int oddcount=0;
        for (int k=0 ; k<numbers.length ; k++){

            for (int i=0 ; i<numbers[k].length; i++){
                int num=numbers[k][i];

                if (num%2!=0){
                    System.out.print(num+" ");
                    continue;

                }else{
                    oddcount++;
                }
            }
        }
        System.out.println();
        System.out.println(oddcount);*/
        System.out.println("=======================================================");

        int evencount=0;
        for (int[] eachnumbers : numbers){
            for (int eachevencount : eachnumbers){

                if (eachevencount%2!=0){
                    continue;

                }
                System.out.println();
                System.out.print(eachevencount+" ");
            }

        }


    }
}
