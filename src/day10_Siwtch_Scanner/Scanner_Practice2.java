package day10_Siwtch_Scanner;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Practice2 {
    public static void main(String[] args) {
       /* write a program for the rate calculater: rateCalculator
        1. asks the user to enter salary (as integer)
        2. asks the user how many hours does she/he works in a week
        3. print the hourly rate
        assume that one year has 52 weeks*/
       Scanner rateCalculator = new Scanner(System.in);
        System.out.println("Welcome to Fikri Bank rateCalculator : ");
        System.out.println("Please enter your Salary");
        double paraciklarim = rateCalculator.nextDouble();

        System.out.println("You just earn this small :) ");
        System.out.println("Ok, No worries, Just Joking, Let's continue");
        System.out.println("How many hours you work essek gibi :");
        byte esseklanbu = rateCalculator.nextByte();
        System.out.println("Hobaaaaaaa");
        System.out.println("Neyse Senin saatlik ucretin bu kadar ahbap : ");
        System.out.println(paraciklarim/52/esseklanbu);





    }
}
