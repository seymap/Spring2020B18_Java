package day09_nestedif.ternary;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class agegroups_nestedif {
    public static void main(String[] args) {
        int age1 = 27;
        String agegruoup = "";
        if (age1 <150 && age1>0) {
            if (age1>0){
                agegruoup = "teeneger";

            }else if (age1<25 && age1 > 20) {
                agegruoup = " adult";
            }else if (age1 > 50 && age1 <60) {
                agegruoup = "old";
            }
        }else {
                agegruoup= "no valid";
            }
        System.out.println(agegruoup);
        System.out.println("********************************************");
        int yas = 44;
        String agegro = (yas> 34 && yas<44)? "teen" : "adult";
        System.out.println(agegro);
    }
}