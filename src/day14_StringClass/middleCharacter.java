package day14_StringClass;
import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.next();  // babanas
        // 0123456 = 7 karakter

        String middleCharacter = ""; //middle characteri bulmaya calsiiyoruz
        int totalChars = word.length(); // 7
        int middleNumber = totalChars / 2; // 7/2==>2

        if (totalChars % 2 != 0) {
            middleCharacter = middleCharacter + word.charAt(middleNumber);
                } else {
            middleCharacter = middleCharacter + word.charAt(middleNumber-1)+word.charAt(middleNumber);
        }
        System.out.println(middleCharacter);

    }

}
