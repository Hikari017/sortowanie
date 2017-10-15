package regex;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("https?://.+\\..+", "http://facebook.pl"));
        System.out.println(Pattern.matches("[789]\\d{0,8}", "71234567")); //Ciąg znaków zaczyna się od cyfr 7 lub 8 lub 9 i jest ich maksymalnie 9.
        System.out.println(Pattern.matches("[amn].+", "amna")); //Ciąg zawiera sekwencje [amn] więcej niż jeden raz
        System.out.println(Pattern.matches("[A-Z]\\d", "B9")); //Czy ciąg składa się tylko ze znaków od A-Z-0-9
        System.out.println(Pattern.matches("aa", "aa")); //Ciąg wynosi tylko "aa"
        System.out.println(Pattern.matches(".+\\..+", "l.h")); //Zwaliduj, czy ciąg znaków zawiera w sobie kropkę
        System.out.println(Pattern.matches("[A-Z]{0,1}[a-z].+\\s[A-Z]{1}[a-z].+","Justyna Luszczak"));
        
    }
}
