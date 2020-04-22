package day09_NestedIf_Ternary;

public class Tearnary_Practice2 {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 200;
        int min = (num1<num2) ? num1 : num2;  // bu min numara nedir formulu if else li
        System.out.println(min);

        System.out.println("===========================================");
         int hour = 11;
         String result = (hour < 12) ? "Good Morning" : (hour>12 &&hour<18) ? "Good Afternoon"
                 :"Good Evening";
        System.out.println(result);

        System.out.println("=====================================================");
         int number = 12000;
         boolean divisibleBy3and5 = (number %3 == 0 && number % 5 == 0) ? true : false;
        System.out.println(divisibleBy3and5);


    }
}
