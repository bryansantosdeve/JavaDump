package br.com.study.java.codewars;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Given a double-precision number assigned to the variable payment, denoting an amount of money, use the NumberFormat class to convert into the US, Indian, Chinese, and French currency formats.
 * <p/>
 * <b>Input Format:</b>
 * A single double-precision number denoting payment.
 * <p/>
 * <b>Output Format:</b>
 * On the first line, print US: u where u is payment formatted for US currency.
 * On the second line, print India: i where i is payment formatted for Indian currency.
 * On the third line, print China: c where is c payment formatted for Chinese currency.
 * On the fourth line, print France: f, where f is payment formatted for French currency.
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
