package day11_Scanner;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Browser {
    public static void main(String[] args) {
        String browserName = "opera";
        switch (browserName){
            case "Chrome" :
            case "chrome":
                System.out.println("Chrome is opening...");
                break;
            case "Firefox":
            case "firefox":
                System.out.println("Firefox is opening...");
            case "Safari" :
            case "safari" :
                System.out.println("Safari is opening...");
                break;
            case "Opera":
            case "opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid Browser name, Please give the right browser name");

        }




    }
}
