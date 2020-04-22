package day13_StringClass;

import javax.crypto.spec.PSource;

public class StringLiterals {
    public static void main(String[] args) {

        String str1 = "Cat"; // String pool
        String str2 = new String("Cat"); // Java Heap
        // boyle yazinca independent bir sey olusturmus oluyor
        // yani fatih == degildir fatih e, ikiside adam bir olur mu ama sadece harfler esit olmus oluyor
        //cat cat yazi olarak ayni ama iki tane farkli cat yani new string olan cat ayni degil
        System.out.println(str1+ " : "+str2);
        System.out.println(str1==str2); // two different object, false,
        String str3 = "Cat";
        System.out.println(str1==str3); //true
    }

}
