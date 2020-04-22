package day07_IfStatements;

public class If_Else_Statement {
    public static void main(String[] args) {
        int number = 100;
        if (number % 2 == 0) {
            System.out.println(number+ " is even number");
        }
        if (number % 2 != 0) {
            System.out.println(number+ " is odd number");
        }
        System.out.println("==================================");
        int number2 = 300;
        if (number2 % 2 == 0) {
            System.out.println(number2 + " is even number");
        }
        else { // otherwise demek even condition
            System.out.println(number2 + " is odd number");
        }
        System.out.println("==================================");
        int number3 = 489;
        boolean evenNum = number3 % 2 == 0;
        if (evenNum) {
            System.out.println(number3 + " is even number");
        }
        else { // otherwise demek even condition
            System.out.println(number3 + " is odd number");
        }

        System.out.println("==================================");

        int age = 15;
        if (age >=21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }

        System.out.println("==================================");
        boolean testedPositiveForCorona = false;
        if (testedPositiveForCorona){
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Come to Work");
        }


    }
}
