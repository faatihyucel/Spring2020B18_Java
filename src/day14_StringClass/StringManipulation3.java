package day14_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School"); // case sensetive, icinde varmi yok mu bakiyor // true
        System.out.println(r1);
        String s2 = "Cybertek School";
        boolean r2 = s2.contains("school"); // case sensetive, icinde varmi yok mu bakiyor // false
        System.out.println(r2);

        //startsWith() konusu burda
        String str3 = "United States";
        System.out.println(str3.startsWith("U"));  // true // case sensetive

        String str4 = "Cybertek School";
        System.out.println(str4.endsWith("l"));//true
        System.out.println(str4.endsWith("School")); // true
        System.out.println(str4.endsWith("school")); // false, case sensetive





    }
}
