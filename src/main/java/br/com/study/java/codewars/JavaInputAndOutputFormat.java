package br.com.study.java.codewars;

import java.util.Scanner;

/**
 * Java's System.out.printf function can be used to print formatted output.The purpose of this exercise is to test your understanding of formatting output using printf.
 * <p/>
 * <b>Input Format</b>
 * Every line of input will contain a String followed by an integer.Each String will have a maximum of alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
 * <p/>
 * <b>Output Format</b><p/> In each line of output there should be two columns: <p/>
 * The first column contains the String and is left justified using exactly 15 characters.
 * The second column contains the integer, expressed in exactly 3 digits. If the original input has less than three digits, you must pad your output's leading digits with zeroes.
 * <p/>
 * <b>Extra explanation</b>
 * Each String is left-justified with trailing whitespace through the first characters.
 * The leading digit of the integer is the character, and each integer that was less than digits now has leading zeroes.
 */
public class JavaInputAndOutputFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++){
            String string = scanner.next();
            int number = scanner.nextInt();
            System.out.printf("%-15s %03d\n", string, number);
        }
    }
}
