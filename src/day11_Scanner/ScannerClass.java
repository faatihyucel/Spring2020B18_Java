package day11_Scanner;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner fatih = new Scanner(System.in);

        System.out.println("Enter a long number: ");
        long a = fatih.nextLong();
        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal: ");
        float b = fatih.nextFloat();
        System.out.println("You have entered: "+b);

        System.out.println("Enter true or false");
        boolean bool = fatih.nextBoolean();

        System.out.println("Enter your sentence: ");
        String str = fatih.next();
        System.out.println("You have entered: "+str); // ilk kelimeyi getiriyor


    }
}
