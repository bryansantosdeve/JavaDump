package br.com.study.java.codewars;

import java.util.Scanner;

/**
 * Two strings, A and B, are called anagrams if they contain all the same characters in the same frequencies.
 * For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 * <p/>
 * <b>Input Format:</b>
 * The first line contains a string A. The second line contains a string B.
 */
public class JavaAnagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String firstInput, String secondInput) {
        char[] firstInputSortedArray = JavaAnagrams.sortCharByAscii(firstInput);
        char[] secondInputSortedArray = JavaAnagrams.sortCharByAscii(secondInput);
        if (String.valueOf(firstInputSortedArray).equalsIgnoreCase(String.valueOf(secondInputSortedArray))) {
            return true;
        }
        return false;
    }

    /**
     * Método de organização feito por meio da técnica de ordenação "Bubble Sort", com complexidade O(n²).
     * Veja mais:
     * <a href="https://blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre">Aqui</a>
     *
     * @param input
     * @return
     * @link <a href="https://blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre/">blog.betrybe.com/tecnologia/bubble-sort-tudo-sobre/</a></a>
     */
    private static char[] sortCharByAscii(String input) {
        char transitionChar = ' ';
        char[] charArray = input.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 1; j < charArray.length - i; j++) {
                if (charArray[j - 1] > charArray[j]) {
                    transitionChar = charArray[j - 1];
                    charArray[j - 1] = charArray[j];
                    charArray[j] = transitionChar;
                }
            }
        }
        return charArray;
    }
}
