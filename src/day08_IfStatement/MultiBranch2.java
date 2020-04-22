package day08_IfStatement;

public class MultiBranch2 {
    public static void main(String[] args) {
        double score = 65.5;
        boolean AGrade = score >= 90 && score <= 100; // 100 >= 90;
        boolean BGrade = score >= 80 && score <90; //89 >= 80;
        boolean CGrade = score >= 70 && score <80;
        boolean DGrade = score >= 60 && score <70;
        boolean FGrade = score <60;

        char grade = ' '; // String grade = " "; bu sekilde de string olabilir

        if (AGrade) {
            grade = 'A';
        } else if (BGrade) {
            grade = 'B';
        } else if (CGrade){
            grade = 'C';
        } else if (DGrade){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);
        System.out.println("Score " + score + " is: " + grade + " grade");



    }
}


