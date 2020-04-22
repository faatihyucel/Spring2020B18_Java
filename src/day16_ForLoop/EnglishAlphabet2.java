package day16_ForLoop;

public class EnglishAlphabet2 {
    public static void main(String[] args) {
        String upperCase = ""; //A~Z
        String lowerCase = ""; // a~z

        for(char ch = 'A'; ch <= 'Z'; ch++){
            upperCase += ch;
        }

        System.out.println(upperCase);

        for(char ch = 'a'; ch <= 'z'; ch++){
            lowerCase += ch;
        }

        System.out.println(lowerCase);

        // Aa Bb Cc Dd ....
        String result = "";

        for(int i=0; i <= upperCase.length()-1; i++ ){

            result +=   upperCase.charAt(i)+"" + lowerCase.charAt(i)+" " ;

        }

        System.out.println(result);

        System.out.println('a' + ""+ 'b');

        System.out.println("==================================");

        //second solution
        int a = 97;
        int A = 65;

        String result2 ="";
        for(int i =0 ; i < 26; i++ ){ // alphabet de 26 character oldugu icin 26, 0 ile basladigi icin 26 dan kucuk diyoruz
            char ch = (char)(A +i);  // upper case characters
            //          65// ascii table da 65 numaradan basladigi icin
            char ch2 = (char)(a +i); // lower case characters
            //                97+0 // ascii table da 97 den basladigi icin

            result2 += ch + "" +ch2+" ";
        }

        System.out.println(result2);







    }


}