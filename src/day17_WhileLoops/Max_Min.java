package day17_WhileLoops;
import day07_IfStatements.MinNumber;

import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        /*1. write a program that can ask the user "enter a number" five times and return the maximum number
        hint: you will nedd for loop and if statement
        2. write a program that can ask the user "enter a number" five times and return the minimum number
        */

        Scanner input= new Scanner(System.in);

        int MaxNumber = -2147483648; //  any number the user provided will be greater than this number
                                    // first user entered variable will be initalized to max number
        int MinNumber = 2147483647;
        for (int i= 1 ; i <= 5; i++){// i : 1, 2,3, 4, 5,
            System.out.println("Enter a number");
            int num = input.nextInt();
                if (num > MaxNumber){
                    MaxNumber = num;
            }
            if (num < MinNumber){
                MinNumber = num;
            }
        }
        System.out.println("Max number you entered: "+MaxNumber);
        System.out.println("Min number you entered: "+MinNumber);


    }
}
