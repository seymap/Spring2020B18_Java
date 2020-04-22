package day21_multidimensionalarray;

public class emails {
    public static void main(String[] args) {

        String [] emails={"c@gmail.com","tek@yahoo.com"};

        for(String eachmail : emails){
            if (eachmail.contains("@gmail.com")) {
                continue;

            }
            System.out.println(eachmail);
        }


    }
}
