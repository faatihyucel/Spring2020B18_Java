package day20_ArraysContinue;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Fatih YUCEL";
            char[] characters = name.toCharArray();

        System.out.println(Arrays.toString(characters));

        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));

        System.out.println("===================================");

        String  name1 = "Fatih YUCEL";
        String name2 = "YUCEL Fatih";

        char[] namech1 = name1.toCharArray();
        char[] namech2 = name2.toCharArray();

        System.out.println(namech1);
        System.out.println(namech2);

        Arrays.sort(namech1);
        Arrays.sort(namech2);

        System.out.println(namech1);
        System.out.println(namech2);

        boolean equalnames = Arrays.equals(namech1,namech2);
        System.out.println(equalnames);



    }
}
