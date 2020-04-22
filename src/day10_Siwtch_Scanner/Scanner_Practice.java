package day10_Siwtch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner Baba = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        byte ogul1 = Baba.nextByte();
        System.out.println("Enter your second number: ");
        byte ogul2 = Baba.nextByte();
        System.out.println("The sum of those two numbers are: "+(ogul1+ogul2));


    }
}
