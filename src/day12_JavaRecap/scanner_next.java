package day12_JavaRecap;
                    import java.util.Scanner;
public class scanner_next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullAddress = "";
        System.out.println("Enter the number of the building: ");
        short BuiNumber = input.nextShort();
        fullAddress += BuiNumber+" "; // fulladdress = fulladress + BuiNumber+ ""

        System.out.println("Enter the street name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road: ");
        String roadType = input.next();
        fullAddress += roadType+", ";

        System.out.println("Enyter city name, State, Zipcode : ");
        String cityname = input.next();
        fullAddress += cityname+"";
        String State = input.next();
        fullAddress += State+ " ";
        int zipCode = input.nextInt();
        fullAddress += zipCode;

        System.out.println("Adress is: "+fullAddress);


    }
}
