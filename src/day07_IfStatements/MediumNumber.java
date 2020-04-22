package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        /* write a java program that accepts three numbers and reteurn the medium number
        (assume that none of them are equal)  */
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMed = (a < b  && a > c) || (a > b  && a < c); // if a is smaller than b and bigger bigger c, the a is medium
        boolean bMed = (b < c  && b > a) || (b > c  && b < a); // if b is smaller than a and bigger bigger c, the b is medium
        boolean cMed = (c < b  && c > a) || (c > b  && c < a); // if c issmaller than a and bigger bigger b, the c is medium

        if (aMed){
            System.out.println(a+" is medium number");
        }
        if (bMed){
            System.out.println(b+" is medium number");
        }
        if (cMed) {
            System.out.println(c+" is medium number");
        }

        System.out.println("================================================");

        double x = 15;
        double y = 25;
        double z = 35;

        boolean xMed = ( y < x && x < z ) || ( z < x && x < y );
        boolean yMed = ( x < y && y < z ) || ( z < y && y < x );
        boolean zMed = ( y < z && z < x ) || ( x < z && z < y );
        if (xMed){
            System.out.println(x+" is medium number");
        }
        if (yMed){
            System.out.println(y+" is medium number");
        }
        if (zMed) {
            System.out.println(z+" is medium number");
        }






    }
}
