package day02_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\tHello");
        System.out.println("Hello");
        System.out.println("\t\t\t\tHello");
        // \t means a paragraph space birakmak
        System.out.println("Cybertek School");
        System.out.println("Cybertek \nSchool");
        System.out.println("\n\n\nMy\nName\nis\n\nFatih\nYucel");
        // \n means new line, starts with th new line
        // print : My favorite TV shows is 'Game of Thrones"
        System.out.println("My Favorite TV Show is \"Game of Thrones\"");
        System.out.println("My Favorute Book is \"Yuzuklerin Efendisi\"");
        // \" prints double code
        System.out.println("\\");
        // \\ prints single slash on console
        System.out.println("My favorite book is \'Java\' "); // \' prints the '
        System.out.println("My favorite book is 'Java' "); // ' prints the '


    }



}
