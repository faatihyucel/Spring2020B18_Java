package day14_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        String username = "";
        boolean bool1 = username.isEmpty(); // false
        if (username.isEmpty())  {
            System.out.println("Please provide the user name first");
        }

        String s1 = "Cat"; // String literal
        String s2 = new String("Cat");

        System.out.println(s1==s2); // false , diferent memory location, different object
        System.out.println(s1.equals(s2)); // True

        // == equal kullanmaktansa .equals kullanmak daha iyi ve net dogru cevap verir dedi kendileri
        String z1 = "Tiger";

        String z2 = new String("Tiger");

        String z3 = "Tiger";

        String z4 = "tiger";

        // ==
        System.out.println( z1 == z2 ); // false
        System.out.println(z2 == z3);  // false
        System.out.println( z1 == z3 ); // true, same object

        // equals():
        System.out.println( z1.equals(z2)  );   // true
        System.out.println( z2.equals(z3) );    // true
        System.out.println(z1.equals(z3));  // true
        System.out.println(z3.equals(z4)); // false








    }
}
