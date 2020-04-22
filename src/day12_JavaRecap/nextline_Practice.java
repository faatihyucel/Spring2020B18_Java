package day12_JavaRecap;

import java.util.Scanner;

public class nextline_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the building: ");
        int BuiNumber = input.nextInt();

        input.nextLine(); //used for taking out the enter from scanner

        System.out.println("Street: ");
        String streetName = input.nextLine(); // Line oldugu icin istedigin kadar yazabilirsin

        System.out.println("Enter the Zip Code: ");
        String zipC = input.next(); // 07073 enter yapacagin icin araya enter koymamiz lazim hemen buradan sonra
        // bizim zip code 0 ile basladigi icin int numaralar sifir ile olmadigi icin string e donusturme yapmamaiz lazim
        input.nextLine(); //take out the enter

        System.out.println("Enyter city name and State seperated by comme and space");
        String citystate = input.nextLine();

        String fulladress = BuiNumber+ " "+streetName+", \n" +citystate+" "+zipC;
        System.out.println(fulladress);

        // input.close(); // kapatmak ister isek boyle yapacagiz
        



    }
}
