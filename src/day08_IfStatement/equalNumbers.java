package day08_IfStatement;

public class equalNumbers {
    public static void main(String[] args) {
        /* 1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
			2.. write a program that can find the number of days in a month
			(Assume that Feb has 28 days)         */
        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;
        boolean n1Equaln2 = n1 == n2 && n2 != n3; // only n1==n2
        boolean n1Equaln3 = n1 == n3 && n1 != n2; // only n1==n3
        boolean n2Equaln3 = n2 == n3 && n2 != n1; // only n2==n3
        boolean allEqual = n1 == n2 && n1 == n3; // all equal
        boolean noneOfThemEqual = n1 != n2 && n1 != n3 && n2 != n3; // none of them equal
        if (n1Equaln2){
            System.out.println("n1 is equal to n2");
        }
        if (n1Equaln3){
            System.out.println("n1 is equal to n3");
        }
        if (n2Equaln3){
            System.out.println("n2 is equal to n3");
        }
        if (allEqual){
            System.out.println("All are equal");
        }
        if (noneOfThemEqual){
            System.out.println("None of them equal");
        }












    }
}
