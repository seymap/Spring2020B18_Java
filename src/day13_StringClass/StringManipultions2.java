package day13_StringClass;

public class StringManipultions2 {

    public static void main(String[] args) {

        String str = "cybertek school is the best";

        String schoolName=str.substring(0,7);

        System.out.println(schoolName);

        String fullname= "seyma peker";
        String firstname=fullname.substring(0,4);
        String lastname=fullname.substring(0,5);

        System.out.println(firstname);
        System.out.println(lastname);

      //  String gmail=lastname.concat("_").concat(firstname).concat("@gmail.com");
        String gmail =lastname+"_"+firstname+"@gmail.com";
        System.out.println(gmail);

        String s2 = "i like java programming";
        s2=s2.replace("java" ,"C++");
        System.out.println(s2);

        String r2 ="Tomorrow is Monday,Tomorrow is Tuesday";
        r2 =r2.replace("Tomorrow","today");
        System.out.println(r2);
    }
}
