package day08_IfStatement;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {
        double score = 95.5;
        boolean AGrade = score >= 90 && score <= 100; // 100 >= 90;
        boolean BGrade = score >= 80 && score <90; //89 >= 80;
        boolean CGrade = score >= 70 && score <80;
        boolean DGrade = score >= 60 && score <70;
        boolean FGrade = score <60;

        if (AGrade) {
            System.out.println(" Your score is 'A' ");
        } else if (BGrade) {
            System.out.println(" Your score is 'B' ");
        } else if (CGrade){
            System.out.println(" Your score is 'C' ");
        } else if (DGrade){
            System.out.println(" Your score is 'D' ");
        } else {
            System.out.println(" Your score is 'F' ");
        }





    }
}
