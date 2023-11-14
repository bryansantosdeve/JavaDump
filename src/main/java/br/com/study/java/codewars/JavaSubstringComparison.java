package br.com.study.java.codewars;

import java.util.Scanner;

/**
 * Given a string, input, and an integer, size, complete the function so that it finds the lexicographically smallest and largest substrings of length.
 * <p/>
 * <b>Input Format:</b>
 * The first line contains a string denoting input.
 * The second line contains an integer denoting size.
 * <p/>
 */
public class JavaSubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int size = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest(input, size));
    }

    public static String getSmallestAndLargest(String input, int size) {
        String smallest;
        String largest;
        String[] array = new String[input.length() - size + 1];

        int auxIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            try {
                String substring = input.substring(i, i + size);
                array[auxIndex] = substring;
                auxIndex++;
                System.out.println(substring);
            } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException exception) {
                break;
            }
        }
        smallest = array[0];
        largest = array[0];

        for (String str : array) {
            if (str != null) {
                // Caso menor
                if (str.compareTo(smallest) < 0) {
                    smallest = str;
                }
                /// Caso seja maior
                else if (str.compareTo(largest) > 0) {
                    largest = str;
                }
            }
        }
        return smallest + "\n" + largest;
    }
}
