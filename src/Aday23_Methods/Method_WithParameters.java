package Aday23_Methods;

import java.util.Scanner;

public class Method_WithParameters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int num=0; n<3; n++){
            if(num>=1){

                System.out.print(num==1);
            }
            if(num<=-1){
                System.out.print(num==-1);

            }
            if(num==0){
                System.out.print(num==0);
            }
            System.out.println(n);
        }


}}
