package day24_Methods;

import java.util.Arrays;
import Resources.Library;

public class Test {

    public static void main(String[] args) {
        String str = "Cybertek";

        String RevStr = Library.Reverse(str);

        System.out.println(  str.equalsIgnoreCase(RevStr)    );

        int[] arr = {100, 300, 200, 40000, 50000,10000000};

        arr =    Library.sortDesending(arr);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("=========================================================");

        String str1 = "Muhtar";

        String RevStr1 = Library.Reverse(str1);

        System.out.println(RevStr1);

        int[] arr1 = {5,9,10, 3, 2,-1};

        arr1 = Library.sortDesending( arr1 );

        System.out.println(Arrays.toString(arr1) );


    }

}