package day11_Scanner;
import java.util.Scanner;
public class Salary_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int sallary = input.nextInt();

        System.out.println("Enter the state tax: ");
        byte stateTax = input.nextByte();
        double statetaxPercentage = stateTax / 100.0 ;

        System.out.println("Enter the federal tax: ");
        byte federalTax = input.nextByte();
        double federalTaxPErcentage = federalTax / 100.0;
        double totalTax = (federalTaxPErcentage+statetaxPercentage)*sallary;
        double SalaryAfterTax = sallary-totalTax;
        System.out.println("Your Salary After Tax is: $" +SalaryAfterTax);
        System.out.println("Total tax: $"+totalTax);
        System.out.println("Montly salary: $" + (SalaryAfterTax/12));




    }
}
