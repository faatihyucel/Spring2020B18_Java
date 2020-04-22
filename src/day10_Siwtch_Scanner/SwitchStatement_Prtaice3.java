package day10_Siwtch_Scanner;

public class SwitchStatement_Prtaice3 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        System.out.println("=========================================================");

        char ch1= 'C';
        String result = "";
        switch (ch1) {
            case 'A':
                result = "A";
                break;
            case 'B':
                result = "B";
                break;
            case 'C':
                result = "C";
                break;
            case 'D':
                result = "D";
                break;
            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);
    }
    }
