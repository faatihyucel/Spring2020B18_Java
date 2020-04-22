package day07_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
/* write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal) */
        double a = 10000;
        double b = 200;
        double c = 400.5;

        boolean aMin = a < b  && a < c; // if a is Smaller than both b and c, the a is min
        boolean bMin = b < a  && b < c; // if b is Smalller than both a and c, the b is min
        boolean cMin = c < a  && c < b; // if c is Smalller than both a and b, the c is min

        if (aMin){
            System.out.println(a+" is minimum number");
        }
        if (bMin){
            System.out.println(b+" is minimum number");
        }
        if (cMin) {
            System.out.println(c+" is minimum number");
        }






    }
}
