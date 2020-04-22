package day08_Ifstatements;

public class new_Practice {
    public static void main(String[] args) {
        int vehi1 =1996;
        int vehi2 = 2001;
        int vehi3 = 2011;
        boolean recall = vehi1> 1995 && vehi1<1998;
        boolean recall2 = vehi2> 2000 && vehi2<2002;
        boolean recall3 = vehi3 >2005 && vehi3< 2010;
        if (recall){
            System.out.println("your veh needs to be recall");
        }
        if (recall2){
            System.out.println("your veh needs to be recall");
        }
        if (!recall3) {
            System.out.println("enjoy");
        }


    }
        }

