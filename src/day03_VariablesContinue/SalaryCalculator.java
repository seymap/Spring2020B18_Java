package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourRAte = 55;
        double stateRate =0.04;
        double fedRate = 0.22;
        double weeklyHours = 40;
        double totalWeeks = 52;

                double salary=hourRAte * weeklyHours * totalWeeks ;
                double stateTax = salary * stateRate ;
                double federalTax = salary * fedRate ;
                double salaryaftertax = salary - ( stateTax + federalTax );

        System.out.println("your salary is:" + salary);
        System.out.println("stateTax is:" + stateTax);
        System.out.println("federaltax is:"+ federalTax);
        System.out.println("total tax is:" + ( federalTax+stateTax) );
        System.out.println("salary after tax is:" + salaryaftertax);


    }

}
