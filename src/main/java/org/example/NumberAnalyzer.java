package org.example;

import java.util.Arrays;

public class NumberAnalyzer {

    public static String analyzeNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "Khong co du lieu";
        }

        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;

        for (int number : numbers) {
            sum += number;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / numbers.length;

        if (average >= 10) {
            return String.format(
                    "Mang %s co %d so chan, %d so le, trung binh = %.2f (TRUNG BINH CAO)",
                    Arrays.toString(numbers), evenCount, oddCount, average);
        }

        return String.format(
                "Mang %s co %d so chan, %d so le, trung binh = %.2f (TRUNG BINH THAP)",
                Arrays.toString(numbers), evenCount, oddCount, average);
    }

    public static void main(String[] args) {
        int[] sample = { 2, 5, 8, 11, 14 };
        System.out.println(analyzeNumbers(sample));
    }
}
