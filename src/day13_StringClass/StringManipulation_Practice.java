package day13_StringClass;

import java.util.Scanner; // scannner yaptik

public class StringManipulation_Practice {
    public static void main(String[] args) { // main method olusturduk
        Scanner input = new Scanner(System.in); // scanner yaptik

        System.out.println("Enter your full name");
        String fullname= input.nextLine(); //cybertek school

        String firstname = fullname.substring(0,fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ")+1);

        firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
        lastname = lastname.substring(0,1).toUpperCase() +lastname.substring(1).toLowerCase();

        System.out.println("Your fist name is "+firstname);
        System.out.println("Your last name is "+lastname);

    }

}
