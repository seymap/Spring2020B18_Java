package day09_nestedif.ternary;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class nested_if {
    public static void main(String[] args) {
        boolean uscitizen = true;
        int age = 23;
        if (uscitizen) {
            if (age > 17) {
                System.out.println("you are eligible");

            } else if (age < 17) {
                System.out.println("grow up");
            }
        } else {
            System.out.println("only us ciixens");
        }
        System.out.println("(((((((((((((((((()))))))))))))))))))");
        int score = 80;
        String grade = "";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                grade = "A";
            } else if (score < 90 && score > 70) {
                grade = "B";
            } else if (score < 65 && score > 55) {
                grade = "c";


            } else {
                grade = "fail";

            }
            System.out.println(grade);
        }

    }





    }

