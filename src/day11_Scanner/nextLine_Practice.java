package day11_Scanner;
import java.util.Scanner;
public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();// burasi enter da yardimci oluyor, enter yapiyor
        System.out.println("Enter your full name: ");
        String fullname = input.nextLine();




    }
}
