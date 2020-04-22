package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {
        /* warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
           */
        double numberOfGallons = 5;
        double gallonsToLiters = numberOfGallons * 3.785 ;
        String result = numberOfGallons + " is equal to: " + gallonsToLiters + " liters";
        System.out.println(result);

        System.out.println("========================================================");
        double numberOfLiters = 100;
        double literToGalons = numberOfLiters / 3.785;
        String result2 = numberOfLiters+" liters equal to "+literToGalons+" gallons";
        System.out.println(result2);

        System.out.println("========================================================");
        int a = 200 ;
        int b = -a++ + - --a * a-- % 2;
        //  b = -200 + -200 * 200 % 2 = -200 - 40000 %2 = -200 - 0 = -200
        System.out.println(b);
        System.out.println(a);

        System.out.println("========================================================");
        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);



    }
}
