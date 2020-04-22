package day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equals(userinputGmail);
        if (result) {
            System.out.println("Logged in");
        } else {
            System.out.println("Invalid");
        }

        boolean result2 = gmail.equalsIgnoreCase(userinputGmail);
        if (result2) {
            System.out.println("Logged in");
        } else {
            System.out.println("Invalid");
        }
        System.out.println("=============================================");

        String password = "mmasda12345";
        if (password.contains(" ")) { // icinde bosluk varmi yok mu ona bakiyor, iyiymis
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("Valid Password");
        }
        System.out.println("========================================");

        String str3 = "United States";
        System.out.println(str3.startsWith("U"));  // true // case sensetive

        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();
        if (webAddress.startsWith("www.")) {
            System.out.println("Valid");
        } else {
            System.out.println("invalid");
        }
        System.out.println("===================================");

        String email = "cybertekschool@yahoo.com";
     if (email.endsWith("@gmail.com")){
         System.out.println("Valid email");
     } else {
         System.out.println("invalid email");
     }





    }
}