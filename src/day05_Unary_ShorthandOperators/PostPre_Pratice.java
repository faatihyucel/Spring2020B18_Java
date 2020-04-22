package day05_Unary_ShorthandOperators;

public class PostPre_Pratice {
    public static void main(String[] args) {
        int a = 50;
        a= --a + a++ + a-- + a++ ;
        // 49  + 49  + 50 +  49
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println();

        int x = 4;
        int y = x * 4 - x++ ;
        System.out.println(y);

        System.out.println();

        int b = 1;
        b = -b-- + b++ / -b-- * --b ;
        System.out.println(b);


    }




}
