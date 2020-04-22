package day09_NestedIf_Ternary;

public class Tearnary2 {
    public static void main(String[] args) {
        int ageOfPerson = 16;
        String eligibleToVote = "";
        if (ageOfPerson>=18) {
            eligibleToVote = "YES";
        } else {
            eligibleToVote = "NO";
        }
        System.out.println(eligibleToVote);

        String eligibleToVote2 = (ageOfPerson>18) ? "YES" : "NO";
        System.out.println(eligibleToVote2);






    }
}
