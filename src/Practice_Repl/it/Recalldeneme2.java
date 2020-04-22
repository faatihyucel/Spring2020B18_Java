package Practice_Repl.it;

public class Recalldeneme2 {
    public static void main(String[] args) {
        int vehicleYear = 1996;
        boolean rc95_98 = (1995 <= vehicleYear && vehicleYear <=1998);
        boolean rc01_02 = (2001 <= vehicleYear && vehicleYear <= 2002);
        boolean rc04_06 =(2004 <= vehicleYear && vehicleYear <= 2006);
        boolean rc15_17 =(2015 <= vehicleYear && vehicleYear <=2017);
        boolean recall =  (rc95_98 || rc01_02  || rc04_06  || rc15_17);
        if (recall) {
            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }

    }
}