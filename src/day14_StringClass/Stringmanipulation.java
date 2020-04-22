package day14_StringClass;

public class Stringmanipulation {
    public static void main(String[] args) {

        String website = "www.cybertek.Gov";
        website = website.toLowerCase();

        boolean validEnding = website.endsWith(" .com") || website.endsWith(" .edu") || website.endsWith(" .gov");

        if (website.startsWith("www.")) {
            System.out.println("valid address");

        } else {
            System.out.println("invalid address");
        }


    }
}