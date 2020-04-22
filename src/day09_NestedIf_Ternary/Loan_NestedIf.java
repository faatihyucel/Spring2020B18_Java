package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary = 120_000;
        byte workHistory = 1;

        if (salary>= 30_000) {
            if (workHistory>=2){
                System.out.println("You are Qualified for loan");
            } else {
                System.out.println("You must have been on job at least 2 years");
            }

        } else {
            System.out.println("You must earn at least $30.000");
        }







    }
}
