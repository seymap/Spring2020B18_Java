package day19_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Uniques {
    public static void main(String[] args) {

        String str="AABCC";
        String result="";
        String nonduplicates="";



        for(int i=0;i<=str.length()-1;i++){
            if(!nonduplicates.contains(""+str.charAt(i))){
                nonduplicates+=str.charAt(i);
            }
        }
        System.out.println(nonduplicates);
        int count=0;
    }



}
