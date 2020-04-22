package repl_it;




import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        for ( int i=0; i<nums.length-1; i++){
            if (nums[i] == 5 & nums[i+1]==5) {

            }
            System.out.println("true");

            }

        System.out.println("false" );
        }


    }

