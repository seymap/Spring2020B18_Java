package day02_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.cert.CertPathValidatorException;

public class Variables {

    public static void main(String[] args) {

        /*
        decleare variables:
        DataType  variableName=Data;
         */

        byte l =4;
        byte w =2;
        byte area =8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        // byte num= 2.5 byte ,short, int, long they only accept whole numbers
        // byte num1 =130 exceeds the range of byte
        // short num2 = 3.5
        short num3 = 1000;
        // short num4 = 4000 exceeds the range of short

        System.out.println(num3);  // 1000

        System.out.println(12345); //by default compiler takes it as int primitive




    }




}
