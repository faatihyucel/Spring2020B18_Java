package day14_StringClass;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "I like to learn Java. I liked to watch the movie Jumanjii";
        int a1 = str.indexOf("J"); // return the index num of first matching one
        System.out.println(a1);

        int a2 = str.indexOf("Jum"); // boyle yazarsak, bu cumlenin ilk siradaki harfinin indexini soyler
        System.out.println(a2);

        int a3 = str.indexOf(" I")+1;
        System.out.println(a3);

        int a4 = str.lastIndexOf("I"); // son I harfinin yerini gosteriyor, fazla ayni harften varssa
        System.out.println(a4);

        String z = "I like C#, C# is cool";

        int c1 = z.lastIndexOf("C");

        System.out.println(c1);

        String x = "I like Java, Java is fun, Java programming is fun";

        int d1 = x.indexOf("Java is");  // second J' index num
        System.out.println(d1);

        int d2 = x.indexOf(", J")+2;   // second J' index num
        System.out.println(d2);

        int d3 = x.lastIndexOf("J"); // last J' index number
        System.out.println(d3);

        int d4 = x.indexOf("Java p"); // last J' index number
        System.out.println(d4);


        char ch1 =    x.charAt(26);

        System.out.println(ch1);



    }


}
