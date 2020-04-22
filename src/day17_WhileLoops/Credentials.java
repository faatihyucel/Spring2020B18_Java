package day17_WhileLoops;
import java.util.Scanner;
public class Credentials {
    public static void main(String[] args) {
        /* user = cybertek
        username = cybertek123   */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter User name");
        String username = input.next();

        System.out.println("Enter Password");
        String password = input.next();

        while (!username.equals("cybertek")&& !password.equals("cybertek123")){
            System.out.println("Please re-enter your credentions");
            System.out.println("Enter User name");
            username = input.next();

            System.out.println("Enter Password");
            password = input.next();
        }
        System.out.println("Logged in");

    }
}
