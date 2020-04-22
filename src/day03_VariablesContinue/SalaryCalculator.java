package day03_VariablesContinue;

public class SalaryCalculator {
    /*
        if:
        rate = 55;
        stateTax = 0.04;
        federalTax =0.22;
        weeklyHours = 40;
        then output will be:
        your salary is: 105600 USD
        your total tax is: 27456 USD
        your income after tax is: 78144 USD
        */
    public static void main(String[] args) {
       // datatype varaiblenname = data;
        double HourlyRate = 55;
        double stateTaxRate= 0.04;
        double FederalTaxRate= 0.22;
        byte Weeklyhours = 40;
        byte totalweeks = 52;
        // salary = hourlyrate * weeklyhours * 52
        double salary = HourlyRate * Weeklyhours * totalweeks;
            // sallary before tax
        // statetax = salary * state taxrate
        double StateTax = salary * stateTaxRate;

        // federal tax = salary * federal tax
        double Federaltax = salary * FederalTaxRate;

        // salaryaftertax = salary - statetax - federaltax
        double salaryaftertax = salary - (Federaltax+StateTax);
        double SalaryAfterTax = salary - ( StateTax - Federaltax );

        System.out.println( 9 + 3); // addition (number+number)
        System.out.println("9" + 3); // 93 concatenation  (text+number)
        System.out.println( 9 + "3"); // 93 concatenation (number+text)
        // concatenation (text+text)

        System.out.println("Your Salary is: $" + salary); // concatenation
        System.out.println("State Tax is: $" + StateTax);
        System.out.println("Federal Tax is: $" + Federaltax);
        System.out.println("Total Tax is: $" +  (Federaltax+StateTax));
        System.out.println("Your Salary After Tax is: $" +salaryaftertax);








    }




}
