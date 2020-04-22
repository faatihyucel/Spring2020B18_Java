package day17_WhileLoops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    /* 4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
	(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
			at the end it will ask if the user want's to calculate another numbers, if user
	entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
						(you will need a lop that has true condition without the iterator) */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i == 0;) { // infiniti time, son kisim olmadigi icin sonsuza kadar devam
                        // burda i >-5 desen de yanindaki dogru oldugu icin devam eder, dogru birsey tanimlamak lazim
            System.out.println("Enter first number:");
            int num1 = input.nextInt();
            System.out.println("Enter second number:");
            int num2 = input.nextInt();
            System.out.println("Enter math operator:");
            String operator = input.next(); // +,-,* , /, %    // string ile de olur dedi

            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplaction is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid Operators");
            }
            System.out.println("Do you wanna continue");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break; // no yazarsa duracak
            }
        }



    }
}
