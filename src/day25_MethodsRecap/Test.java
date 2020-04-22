package day25_MethodsRecap;

import Resources.Library;

import java.security.spec.RSAOtherPrimeInfo;

public class Test {
    public static void main(String[] args) {

        String str = "AAABBBBBDDCCCCC";
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str2 = "AAABBBBBDDCCCCC";
        String str3 = "B";
        int result2 = Library.Frequency(str2,str3);
        System.out.println(result2);

        String str4 = "AAABBBBBDDCCCCC";
        String result3 = Library.FrequencyOfChars(str4);
        System.out.println(result3);





    }
}
