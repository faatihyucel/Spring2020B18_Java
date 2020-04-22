package day08_IfStatement;

public class EqualNumber_Multi_2 {
    public static void main(String[] args) {
        double n1 = 100.5;
        double n2 = 300.5;
        double n3 = 300.5;
        boolean n1Equaln2 = n1 == n2 && n2 != n3; // only n1==n2
        boolean n1Equaln3 = n1 == n3 && n1 != n2; // only n1==n3
        boolean n2Equaln3 = n2 == n3 && n2 != n1; // only n2==n3
        boolean allEqual = n1 == n2 && n1 == n3; // all equal

        String result =  " ";

        if (n1Equaln2){
           // System.out.println("n1 is equal to n2");
            result = "n1 is equal to n2";
        } else if (n1Equaln3) {
            //System.out.println("n1 is equal to n3");
            result = "n1 is equal to n3";
        } else if (n2Equaln3) {
            //System.out.println("n2 is equal to n3");
            result = "n2 is equal to n3";
        } else if (allEqual) {
            //System.out.println("All are equal");
            result = "All are equal";
        } else {
            result = "None of them equal";
        }

        System.out.println(result);



    }
}
