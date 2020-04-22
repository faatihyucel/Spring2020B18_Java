package day10_Siwtch_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Scanner_Number {
    public static void main(String[] args) {
        Scanner scanlan = new Scanner(System.in);

        System.out.println("Enter your fist number: ");
        int num1 = scanlan.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scanlan.nextInt();

        System.out.println("Enter your third number: ");
        int num3 = scanlan.nextInt();

        int max = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2: num3;
        System.out.println("Maximum number is :"+ max);

        int min = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2: num3;

        System.out.println("Minimum number is :"+ min);





    }




}
