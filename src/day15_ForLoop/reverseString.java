package day15_ForLoop;

public class reverseString {
    public static void main(String[] args) {

            String str = "FatihYuceL";
            //0123
            String reverse1 = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

            int lastindexnum = str.length()-1;
            for (int i = lastindexnum; i >= 0; i--) {

                System.out.print(str.charAt(i));
            }

        System.out.println("\n"); /// enter yapti

            String reverse2="";
        for (int i = lastindexnum; i >= 0; i--) {
            reverse2 += str.charAt(i);
        }
        System.out.println(reverse2);
    }
}
