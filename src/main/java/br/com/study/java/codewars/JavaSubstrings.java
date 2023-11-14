package br.com.study.java.codewars;

import java.util.Scanner;

public class JavaSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f1Input = scanner.next();
        String s2Input = scanner.next();

        JavaSubstrings.operate(f1Input, s2Input);
    }


    private static void operate(String firstInput, String secondInput) {
        /// Soma
        int sum = firstInput.length() + secondInput.length();
        System.out.println(sum);

        /// Compara se o primeiro input é "menor" que o segundo. Se for, retorna -1, caso o segundo seja menor que o primeiro, retorna 1.
        int isLexicographicallyLargerThan = firstInput.compareTo(secondInput);

        // f1 < s2
        if (isLexicographicallyLargerThan <= 0) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        String f1InitialChar = String.valueOf(firstInput.charAt(0)).toUpperCase();
        String f2InitialChar = String.valueOf(secondInput.charAt(0)).toUpperCase();
        String replacedFirstInput = firstInput.replace(firstInput.charAt(0), f1InitialChar.toCharArray()[0]);
        String replacedSecondInput = secondInput.replace(secondInput.charAt(0), f2InitialChar.toCharArray()[0]);

        System.out.println(replacedFirstInput + " " + replacedSecondInput);
    }
}
