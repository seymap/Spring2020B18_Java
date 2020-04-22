package day09_nestedif.ternary;

public class agegroups {
    public static void main(String[] args) {
        int age = 19;
        String agegroup = "";
        if (age < 3 && age > 0) {
            agegroup = "baby";
        } else if (age > 3 && age < 5) {
            agegroup = "toddler";
        } else if (age > 5 && age < 9) {
            agegroup = "kid";

        } else if (age > 9 && age < 13) {
            agegroup = " preteen";

        } else if (age > 13 && age < 18) {
            agegroup = " teeneager";

        } else if (age > 18 && age < 20) {
            agegroup = " young adult";
        } else {
            agegroup = " invalid entry";
            System.out.println(agegroup);
 boolean eligibletobuy = agegroup == "young adult" || agegroup == "teeneager";

        }
    }
}
