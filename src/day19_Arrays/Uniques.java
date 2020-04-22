package day19_Arrays;
import java.util.Scanner;
public class Uniques {
    public static void main(String[] args) {

/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */

                String str = "xxxfcccddaeeeetddddikkkkkhvvvvv";

                String result = ""; //"B"


                for(int  j = 0; j <= str.length()-1; j++ ){
                    int count = 0;
                    for(int i=0; i <= str.length()-1; i++){
                        if(str.charAt(i) == str.charAt(j)){
                            count++;
                        }
                    }
                    if(count == 1){  // if unique
                        result+= str.charAt(j);
                    }

                }

                System.out.println(result);

        System.out.println("===========================================================");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1 = input.next();

        String result1 = ""; //"C", to store the unique characters


        for(int j1=0; j1 <= str.length()-1; j1++ ){
            char ch2 = str.charAt(j1);
            int count1 = 0 ;  // to count the occurence of the character

            for(int i = 0; i <= str.length()-1; i++){
                char ch1 = str.charAt(i);
                if(ch1 == ch2){  // check how mnay time the character is  occured in the string
                    count1++;
                }
            }

            if(count1 == 1){  // the the character at index J is unique , will be concated to thre sult
                result1+=ch2;
            }

        }


        System.out.println(result1);
           }

        }