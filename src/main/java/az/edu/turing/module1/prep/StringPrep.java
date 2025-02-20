package az.edu.turing.module1.prep;

import java.util.Locale;

public class StringPrep {
    public static void main(String[] args) {

        String str = "apple-banana-grape";
        String[] words = str.split("-");
        System.out.println(words[2]);
        System.out.println(str.replace("banana", "orange"));
        System.out.println(str.length());
        System.out.println(str.concat(" is tasty"));

    }
}
