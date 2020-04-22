package day07_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        /* write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)    */
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b  && a > c; // if a is greater than both b and c, the a is max
        boolean bGreater = b > a  && b > c; // if b is greater than both a and c, the b is max
        boolean cGreater = c > a  && c > b; // if c is greater than both a and b, the c is max

        if (aGreater){
        System.out.println(a+" is greater number");
        }
        if (bGreater){
        System.out.println(b+" is greater number");
        }
        if (cGreater) {
        System.out.println(c+" is greater number");
        }


    }
}
