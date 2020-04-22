package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {
        String str = "java java java java java java java java java";

        String result = "";
        int count = 0;
        while (str.contains("a")){
            count++;
            str = str.replaceFirst("a","A");
        }

        System.out.println(count);
        System.out.println(str);

        System.out.println("==============================================");
        String str2 = "Cybertek School is a great place to study".toLowerCase();  //  is fun is cool

        int count2 = 0 ;

        String word = "s".toLowerCase();  // ignoring the case sensitiveity by converting both string to lowercase

        while(str2.contains(word)){

            count2++;
            str2 = str2.replaceFirst(word, ""); // after counting the first "Java",w e need to rmeove it from the str

        }


        System.out.println(count2);
        System.out.println(str2);
    }

}