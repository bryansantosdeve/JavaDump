package br.com.study.java.codewars;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely composed of odd integers or
 * entirely composed of even integers except for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 */
public class Outlier {
    static int find(int[] integers) {
        Stack<Integer> oddNumbers = new Stack<>();
        Stack<Integer> evenNumbers = new Stack<>();

        for (int i = 0; i < integers.length; i++) {
            int number = integers[i];
            if (number % 2 == 0) {
                evenNumbers.push(number);
            } else {
                oddNumbers.push(number);
            }
        }

        if (oddNumbers.size() < evenNumbers.size()) {
            return oddNumbers.pop();
        } else {
            return evenNumbers.pop();
        }
    }

    static class OutlierTest {
        @Test
        public void sampleTests() {
            assertEquals(3, Outlier.find(new int[]{2, 6, 8, -10, 3}));
            assertEquals(206847684, Outlier.find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
            assertEquals(0, Outlier.find(new int[]{Integer.MAX_VALUE, 0, 1}));
            assertEquals(10, Outlier.find(new int[]{10, -45, -71}));
        }
    }
}
