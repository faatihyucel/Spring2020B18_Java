package day09_NestedIf_Ternary;

public class ageGropus_NestedIF {
    /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
    public static void main(String[] args) {

        int age = 57;
        String ageGroup = "";
        if (age>=0 && age<= 150){
            if (age<21){
                ageGroup = "Teenager";
            } else if (age<55){
                ageGroup = "Adult";
            } else {
                ageGroup = "Senior";
            }

        } else {
            ageGroup = "Invalid Entry";
        }
        System.out.println(ageGroup);





    }
}
