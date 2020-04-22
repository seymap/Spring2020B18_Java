package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {
        double ang1 = 30;
        double ang2 = 50;
        double ang3 = 60;
        short sumOfAngles =  (short)(ang1 + ang2 +ang3);


        if(sumOfAngles == 180) {
            System.out.println("The shape is a triangle");
        }

        if(sumOfAngles != 180) {
            System.out.println("The shape is not a valid triangle");
        }







    }

}
