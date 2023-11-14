package br.com.study.java.codewars;

import java.util.Scanner;

public class JavaDataTypesSize {

    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();

        for (int i = 0; i < iterations; i++) {
            try {
                long value = scanner.nextLong();
                System.out.println(value + " can be fitted in:");
                if (value >= -128 && value <= 127) System.out.println("* byte");
                if (value >= -32768 && value <= 32767) System.out.println("* short");
                if (value >= -2147483648 && value <= 2147483647) System.out.println("* int");
                /// Every decimal number be fitted in long.
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
