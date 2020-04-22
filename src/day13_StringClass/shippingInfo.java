package day13_StringClass;
import java.util.Scanner;
public class shippingInfo {
   /* write a program for the shipping info that, the program should ask:
    building number
    Street address (Assume it has more than one word)
    city name
    state name
    zip code
    full name of the person:
    and prints the ship to info in the following format:
    ex output:
    Ship To:  Jimmy joe
     7925 Jones Branch Dr
    MCLean, VA 22102 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum = input.next(); // 112A

        input.nextLine(); // Enter ettigimiz kismi absorve ediyor cunku oncesinde next var nextline olsa gerek kalmaz
                            // eger ustu next line yapsak gerek kalmaz, sadece ornek olsun diye biraktik buraya
        System.out.println("Enter your street address");
        String streetAddr = input.nextLine(); // bunu kullanir isen enter kismina gerek kalmiyor

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String statename = input.nextLine();

        System.out.println("Enter your zip code");
        String ZipCode = input.next();

        input.nextLine(); // asagida nextline oldugu icin ve ustte de next oldugu icin bunu araya yazmamiz lazim
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String result = "Ship To: "+fullName+"\n"+buildingNum+" "+streetAddr+"\n"+cityName+", "+statename+" "+ZipCode;
        System.out.println(result);













    }
}
