package day17_WhileLoops;

public class WhileLoopPractice {
    public static void main(String[] args) {

        int i = 0;
        while(i<=20){
            if (i %2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("========================");
        int n = 0;
        int sum = 0;
        while(n<=10){
            if (n %2 == 0){
                sum += n;
            }
            n++;
        }
        System.out.println(sum);
    }
}