package day13_StringClass;

import java.util.Scanner;

public class StringManipulation_Practice2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your first name");
    String firstname= input.nextLine();
        System.out.println("Enter your last name");
        String lastname= input.nextLine();

    String firstnameIN = firstname.substring(0,1);
    String lastnameIN = lastname.substring(lastname.indexOf(" ")+1,lastname.indexOf(" ")+2);

    firstnameIN = firstname.substring(0,1).toUpperCase();
    lastnameIN = lastname.substring(0,1).toUpperCase();

    System.out.println(firstnameIN+lastnameIN);

}

}
