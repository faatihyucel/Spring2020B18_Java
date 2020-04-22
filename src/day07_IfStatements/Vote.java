package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {
        int age = 18;
        boolean UScitizen = true;
        boolean eligible = age >= 18 && UScitizen == true;
        if (eligible){
            System.out.println("You are eligible to Vote");
        }
        if (!eligible){
            System.out.println("You are not eligible to Vote");
        }
        System.out.println("=====================================================");
        int age1 = 12;
        boolean eligible1 = age1 >= 18 && UScitizen == true;
        if (eligible1 == true){
            System.out.println("You are eligible to Vote");
        }
        if (eligible1 == false){
            System.out.println("You are not eligible to Vote");
        }







    }



}
