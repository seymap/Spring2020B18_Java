package day11_Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browseName = "chrome";
        switch(browseName){

            case "chrome":
                System.out.println("chrome is opening. . .");
                break;
            case "firefox":
                 System.out.println("firefox is opening. . .");
                 break;

            case "safari":
                System.out.println("safari is opening . . .");
                break;

            case "opera":
                System.out.println("opera is opening . . .");
                break;
            default:
                System.out.println("invalid");



        }


    }
}
