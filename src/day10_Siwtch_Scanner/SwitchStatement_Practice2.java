package day10_Siwtch_Scanner;

public class SwitchStatement_Practice2 {
    public static void main(String[] args) {
        int num = 0;

        switch (2) { // parantezin icinde kac numara koyarsan case ordan basliyor
            case 1:
                num +=3 ;
            case 2:
                num += 2;
                break; // bu break arkadasi nereye koyarsan toplama duruyor, ileri gitmiyor
            case 3:
                num +=10;
            default:
                num -= 5;
        }
        System.out.println(num);











    }
}
