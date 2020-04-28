package repl_it;
import java.util.Scanner;
public class rep149 {

        public static void add_to_r(int[] r,int n)
        {
            //create new array with one more position.
        int[] newArray=new int[r.length+1];
        for (int i=0;i<r.length;i++){
            newArray[i]=r[i];
        }
        newArray[newArray.length-1]=n;
        for (int each:newArray){
            System.out.println(each);
        }



        }

        public static void main(String[] args) {


            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt(),n = inp.nextInt();
            int[] arr = new int[size];
            for(int i=0 ;i<=size-1;i++)
            {

                arr[i]=inp.nextInt();
            }

            add_to_r(arr, n);


        }
    }

