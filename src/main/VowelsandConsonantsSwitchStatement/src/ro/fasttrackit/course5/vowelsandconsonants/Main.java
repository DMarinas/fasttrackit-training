package ro.fasttrackit.course5.vowelsandconsonants;


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        int vowels=0, consonants=0;
        String str;
        char ch;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string -->");
        str=input.nextLine();

        for (i=0;i<str.length();i++) {
            ch=str.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': vowels++; break;
                    default:consonants++;
                }
            }
        }
        System.out.println();
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
    }

