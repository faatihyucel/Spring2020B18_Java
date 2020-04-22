package day14_StringClass;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        String validusername = "cybertek";
        String validpassword = "cybertekschool";

        Scanner input = new Scanner (System.in);

        System.out.println("Enter your username");
        String inputusername = input.next();

        System.out.println("Enter your password");
        String inputpassword = input.next();

        if (inputusername.equals(validusername) && inputpassword.equals(validpassword)){
            System.out.println("Log in succesfull");
        } else {
            System.out.println("Invalid credential");
        }





    }
}
