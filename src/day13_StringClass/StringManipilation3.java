package day13_StringClass;

public class StringManipilation3 {
    public static void main(String[] args) {

        String str = "I like Java programming";
             int num1 = str.indexOf("J");
        System.out.println(num1);

        String str2 = "I like Java programming with John";
        int num2 = str2.indexOf("John"); // sen tam ismide verebilirsin ama ilk J harfinin index numarasi geliyor
        System.out.println(num2);

        String str3 = "Cybertek school is awesome";
        int firstS = str3.indexOf("s");
        int secondS = str3.indexOf("is")+1; // is deki s harfini bulmak icin +1 koyuyorsun, awesome da +3
        System.out.println(firstS);
        System.out.println(secondS);

        String str4 = "I like Java programming";
        int num4 = str4.indexOf("F"); //// olmayinca -1 codu verir, negatif number verir
        System.out.println(num4);

        String str5 = "I like Java programming";
        int num5 = str5.indexOf("zaman"); //// olmayinca -1 codu verir, negatif number verir
        System.out.println(num5);

        String fullname = "Kuzzat Altay";
        String firsttname = fullname.substring(0, fullname.indexOf(" ") ) ;
        String lasttname = fullname.substring(fullname.indexOf(" ")+1); // bosluktan sonra olani verdi
        System.out.println(firsttname);
        System.out.println(lasttname);

        String fullname1 = "Mehmet Fatih Sultan Han Hazretleri";
        String firsttname1 = fullname1.substring(0, fullname1.indexOf(" ") ) ;
        String lasttname1 = fullname1.substring(fullname1.indexOf(" ")+1); // bosluktan sonra olani verdi
        System.out.println(firsttname1);
        System.out.println(lasttname1);








    }
}
