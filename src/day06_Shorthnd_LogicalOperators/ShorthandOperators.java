package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10;
        System.out.println(x);

        x += 60;
        System.out.println(x);

        String schoolname = "CyberTek";
        schoolname += 12345;
        System.out.println(schoolname);

        System.out.println( 'a' + 'b'); // ascii table = 97+98

        char ch1 = 'a'; // 97
        ch1 += 'b';  // 98
        //char 195 ==> character
        System.out.println(ch1); // character becuase it is char, char always bring chracter from ascii table

        int num = 'z'; // num = 122
        num += 'x'; // num = num + 120
        System.out.println(num); // 122+120=242

        System.out.println("===============================================================");
        int x1 = 20;
        x1 -= 10;
        System.out.println(x1);

        x1 -= 60;
        System.out.println(x1);

        System.out.println("===============================================================");
        int x2 = 20;
        x2 *= 10;
        System.out.println(x2);

        x2 *= 60;
        System.out.println(x2);

        System.out.println("===============================================================");
        int x3 = 20;
        x3 /= 10;
        System.out.println(x3);

        x3 /= 2;
        System.out.println(x3);

        System.out.println("===============================================================");






    }
}
