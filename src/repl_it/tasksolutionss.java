package repl_it;

public class tasksolutionss {


    public static void main(String[] args) {

            kmToMiles(10); // km to miles
            gallonToLitters(10); // gallons to litters
            Calculator(20,20,"+"); // calculation
            Grade(881);

        }
        public static void kmToMiles(double km){
            double miles = km * 0.612;
            System.out.println(km +" is "+miles+" miles");
        }
        public static void gallonToLitters(double gl){
                double litter = gl * 3.75;
                System.out.println(gl+" is "+litter+" litters");
    }
        public static void Calculator(int num1, int num2, String str) {
            int result = 0;
            if (str.equals("+")) {
                result += (num1 + num2);
            } else if (str.equals("-")) {
                result += (num1 - num2);
            } else if (str.equals("*")) {
                result += (num1 * num2);
            } else if (str.equals("/")) {
                result += (num1 / num2);
            } else if (str.equals("%")) {
                result += (num1 % num2);
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("Your Calculation is " + result);
        }
                public static void Grade(int grade){
                String str ="Your Score is: ";
                if (grade >=90 && grade <=100){
                    str+="A";
                } else if (grade >=80 && grade <=89){
                    str+="B";
                } else if (grade >=70 && grade <=79){
                    str+="C";
                } else if (grade >=60 && grade <=69){
                    str +="D";
                } else if (grade >=0 && grade <=59){
                    str +="F";
                } else {
                    str +="Invalid Score";
                }
                System.out.println(str);
            }}


