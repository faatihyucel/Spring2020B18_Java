package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str = "Cybertek school is the best";
        String schoolname = str.substring(9,15);
        String firmaname = str.substring(0,8);
        System.out.println(schoolname);
        System.out.println(firmaname);

        String fullname="Kuzzat Altay";
        //               01234567891011
        String firstname = fullname.substring(0,6);
        String lastname = fullname.substring(7,11+1);
        // +1 yaziyoruz ki son harfi alsin 12 de yazabilirsin anla diye not gibi biraktik
        // 13 yazarsan error verir ama
        System.out.println(firstname);
        System.out.println(lastname);

        // full name  =firstname  lastname
        // gmail: lastName_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        //                0123456789 ....

        String firsttname = Murtaza.substring(0, 6+1 ); // or 0,7
        String lasttname = Murtaza.substring(8, 14+1);  // or 8,15
        System.out.println(firsttname);
        System.out.println(lasttname);

        // String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
        String gmail = lasttname + "_" + firsttname + "@gmail.com";
        //   String gmail = Murtaza.substring(8, 14+1) +"_"+Murtaza.substring(0, 6+1 ) + "@gmail.com";

        System.out.println(gmail);

        String s2 = "I like C# programing C# C#";
        s2 = s2.replace("C#", "Java");
        System.out.println(s2);

        String name = "Covid 1828191821";
        name = name.replace("18","44");
        System.out.println(name);

        String s3 = "I like C# programing C# C#";
        s3 = s3.replaceFirst("C#", "Java");
        System.out.println(s3);



    }


}



