package day20_ArraysContinue;

import java.util.Arrays;
public class Array_Sorting {
    public static void main(String[] args) {
        int[] arr1 = {9,5,6,3,2,7,8,4,1};
        Arrays.sort(arr1); // sort yapinca siraya sokuyor?
        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: " +arr1[0]);
        System.out.println("Second min number is: " +arr1[1]);
        System.out.println("First max number is: " +arr1[arr1.length-1]);
        System.out.println("Second max number is: " +arr1[arr1.length-2]);

        char[] ch = {'a', 'r', 'c', 'w','b', 'e', 'k'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String [] names = {"anna","ali","veli", "deli","kirkdokuz", "elli"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String [] names2 = {"anna","ali","veli", "Deli","kirkdokuz", "elli"}; // asci table da buyuk harfler daha once gelir haciii
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));

        System.out.println("========================================");

        int[] arr = {3,1,4,-1,100,-100,200,155};
        Arrays.sort(arr);

        int[] arrDesc = new int[arr.length];

        System.out.println(Arrays.toString(arr));
        int j = 0;
        for (int i=arr.length-1; i>=0; i--) {
           // System.out.print(arr[i] +" ");
            arrDesc[j] = arr[i];

            j++;
        }
        System.out.println(Arrays.toString(arrDesc));

    }
}
