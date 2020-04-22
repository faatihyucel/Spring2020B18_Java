package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /* salary, federal taxe rate, state tax rate, loan, ssn

         */
        int salary = 120000;
        double federaltax = 0.18;
        double statetax = 0.065;
        // salary after tax = salary(1-sum of taxes)
        double sumtaxes = federaltax + statetax;
        double salaryaftertax = salary * (1-sumtaxes);

        System.out.println(salaryaftertax); // salary after tax

        System.out.println("========================");

        // area of the circle = r * r * pi

        double r = 5.5;
        double pi = 3.14;
        double area = r * r * pi;
        System.out.println(area);

        System.out.println("========================");

        double kg = 60;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("========================");

        double lira = 1000;
        double liraindollar = lira / 6.15;
        System.out.println(liraindollar);

        System.out.println("========================");

        double  liter = 10000;
        double gallon = liter / 3.7;
        System.out.println(gallon);

        System.out.println("========================");






    }









}
