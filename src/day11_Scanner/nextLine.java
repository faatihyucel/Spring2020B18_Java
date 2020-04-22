package day11_Scanner;
import java.util.Scanner;
public class nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name: ");
        String fullname = input.nextLine(); // bir sonraki line a yazmasi lazim,
                                            // yoksa bos gecer sadece enter yazar gecerse

        System.out.println("Your full name is: "+fullname);
        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();
        System.out.println("Your entered: "+sentence);

    }
}
