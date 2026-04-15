package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberAnalyzerTest {

    @Test
    void analyzeNumbers_returnsNoData_whenInputIsNull() {
        String result = NumberAnalyzer.analyzeNumbers(null);

        assertTrue(result.contains("Khong co du lieu"));
    }

    @Test
    void analyzeNumbers_returnsNoData_whenInputIsEmpty() {
        String result = NumberAnalyzer.analyzeNumbers(new int[] {});

        assertTrue(result.contains("Khong co du lieu"));
    }

    @Test
    void analyzeNumbers_returnsHighAverageBranch_whenAverageAtLeastTen() {
        int[] input = { 10, 12, 15, 13 };

        String result = NumberAnalyzer.analyzeNumbers(input);

        assertTrue(result.contains("co 2 so chan, 2 so le"));
        assertTrue(result.contains("TRUNG BINH CAO"));
    }

    @Test
    void analyzeNumbers_returnsLowAverageBranch_whenAverageBelowTen() {
        int[] input = { 2, 5, 8, 11, 14 };

        String result = NumberAnalyzer.analyzeNumbers(input);

        assertTrue(result.contains("co 3 so chan, 2 so le"));
        assertTrue(result.contains("TRUNG BINH THAP"));
    }
}
