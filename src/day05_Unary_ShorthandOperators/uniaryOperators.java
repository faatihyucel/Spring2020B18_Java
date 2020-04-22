package day05_Unary_ShorthandOperators;

public class uniaryOperators {
    public static void main(String[] args) {
        int a = 10; // positive 10
        int b = -a; // negative 10
        System.out.println(a);
        System.out.println(b);
        boolean result1 = b > 0 ;
        boolean result2 = b < 0 ;
        System.out.println(result1);
        System.out.println(result2);

        int z = 100;
        System.out.println(++z);
        int f = 200;
        System.out.println(--f);
        System.out.println(--f);

        int p = 300;
        System.out.println(p++);
        System.out.println(p);

        int a1 = 333;
        System.out.println( ++ a1);
        System.out.println(a1);

        int b1 = 444;
        System.out.println(-- b1);
        System.out.println(b1);

        int aa1 = 333;
        System.out.println( aa1 ++);
        System.out.println(aa1);

        int bb1 = 444;
        System.out.println( bb1 --);
        System.out.println( bb1);

    }






}
