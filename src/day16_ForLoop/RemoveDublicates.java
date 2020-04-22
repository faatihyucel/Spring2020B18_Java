package day16_ForLoop;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "ababab";
        //            012345
        String result = "";
        for (int i = 0; i <= 5 ; i++){
            if (!result.contains(""+str.charAt(i))) { // tekrar olanlari cikariyor
            result += str.charAt(i);
        }
        }
        System.out.println(result);

        System.out.println("========================================");

        String str2 = "cdabcdabcdabxtabcdxt";
        //            012345.....
        String result2 = "";
        for (int i = 0; i <= 15 ; i++){
            if (result2.contains(""+str2.charAt(i))) {
                continue;
            }
                result2 += str2.charAt(i);
        }
        System.out.println(result2);




    }
}
