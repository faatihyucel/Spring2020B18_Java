package day12_JavaRecap;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Enumeration;
import java.util.Scanner;

public class scanner_nextline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Enter your name: ");
       // String name = input.next(); ////// String de enter enter enter enter np sonra fatih ok
        System.out.println("Enter some number: ");
        int num = input.nextInt(); ////// int byte short vb de enter enter enter enter np sonra numara ok
        System.out.println(num);

        input.nextLine(); // used for taking out the "Enter
        System.out.println("Enter your name: ");
        String name = input.nextLine(); ////// nextline da sikinti yok istedigin kadar yaz baba
        System.out.println(name);







    }
}
