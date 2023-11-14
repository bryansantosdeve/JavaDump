package br.com.study.java.codewars;

import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. Given a string input, print Yes if it is a palindrome, print No otherwise.
 * <p/>
 * <b>Example:</b>
 * Word "Madam" is a palindrome.
 */
public class JavaReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int aux = 0;
        char[] reversed = new char[input.length()];
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed[aux] = input.toCharArray()[i];
            aux++;
        }

        if (String.valueOf(reversed).equals(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
