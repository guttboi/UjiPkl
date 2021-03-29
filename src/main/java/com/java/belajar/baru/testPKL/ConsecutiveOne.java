package com.java.belajar.baru.testPKL;

public class ConsecutiveOne {

        public int findConsecutiveOne(int[] input) {
            int currentCount = 0;
            int max = 0;
            for (int n : input) {
                currentCount = n == 0 ? 0 : currentCount + 1;
                max = Math.max(max, currentCount);
            }
            return max;
        }

        public static void main(String[] args) {
            int[] input = { 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0,};
            System.out.println( new ConsecutiveOne().findConsecutiveOne(input));
        }
    }

