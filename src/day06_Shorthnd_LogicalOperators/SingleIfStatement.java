package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldWeather = true;

        if(coldWeather) {
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = true;
        if (coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("buy more water");
            System.out.println("stay at home");
            System.out.println("do more java coding");
        }
        System.out.println("===============================================================");
        int a = 201;
        boolean evennumber = a % 2 == 0;
        boolean oddNumber = a %2 != 0;
        if (evennumber){
            System.out.println(a+" is even number");
        }
        if (oddNumber) {
            System.out.println(a+" iss odd number");
        }




    }




}
