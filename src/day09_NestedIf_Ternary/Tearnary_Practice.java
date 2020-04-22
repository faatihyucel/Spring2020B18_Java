package day09_NestedIf_Ternary;

public class Tearnary_Practice {
    public static void main(String[] args) {
        int num = 10;
        char ch1 = ' ';

        if (num > 0) {
            ch1 = '+';
        } else if (num < 0) {
            ch1 = '-';
        } else {
            ch1 = '0';
        }
        System.out.println(ch1);
        char ch2 = ( num > 0 ) ? '+' : ( num < 0 ) ? '-': '0' ;
        System.out.println(ch2);
        System.out.println(ch1+ch2); // ascii table da cikanlari toplar boyle yaparsan

        System.out.println("==================================================");
        byte score = 50;
        String grade = (score>=90&&score<=100)?"Excellent":(score>=80&&score<90)?"Great":
                (score>=70&&score<80)?"Good":(score>=60&&score<70)?"Pass"
                        :(score<60&&score>0)?"Failed":"invalid";
        System.out.println(grade);










    }
}
