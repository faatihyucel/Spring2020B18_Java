package day14_StringClass;
import java.util.Scanner;
public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
       word1 = word1.substring(1); //  word1 = word1.substring(1,word1.length()); diye de yazilabilir idi

        System.out.println("Enter second word");
        String word2 = input.next();
        word2 = word2.substring(1,word2.length()); // word2 = word2.substring(1); diyede yazilabilir,
                                                    // parantezdeki 1, index 1 den basla diyor

        String result = word1+word2;
        System.out.println(result);




    }
}
