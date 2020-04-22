package day10_Siwtch_Scanner;

import java.util.Scanner; // iste burasini yaziyoruz scanner icin

public class Scanner_Class {
    public static void main(String[] args) {
             Scanner Muktar = new Scanner(System.in);
        System.out.println("Enter a byte number: ");
        byte num1 = Muktar.nextByte();

        System.out.println("You have entered "+num1);

        if (num1%2==0){
            System.out.println(num1+" is even number");
        } else {
            System.out.println(num1+" is odd number");
        }






    }

}
