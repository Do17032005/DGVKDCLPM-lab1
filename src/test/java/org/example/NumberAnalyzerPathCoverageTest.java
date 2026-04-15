package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberAnalyzerPathCoverageTest {

    @Test
    void path_nullInput_returnsNoData() {
        String result = NumberAnalyzer.analyzeNumbers(null);

        assertTrue(result.contains("Khong co du lieu"));
    }

    @Test
    void path_emptyInput_returnsNoData() {
        String result = NumberAnalyzer.analyzeNumbers(new int[] {});

        assertTrue(result.contains("Khong co du lieu"));
    }

    @Test
    void path_nonEmpty_allEven_averageAtLeastTen_returnsHighAverage() {
        int[] input = { 10, 12, 14 };

        String result = NumberAnalyzer.analyzeNumbers(input);

        assertTrue(result.contains("co 3 so chan, 0 so le"));
        assertTrue(result.contains("TRUNG BINH CAO"));
    }

    @Test
    void path_nonEmpty_allOdd_averageBelowTen_returnsLowAverage() {
        int[] input = { 1, 3, 5 };

        String result = NumberAnalyzer.analyzeNumbers(input);

        assertTrue(result.contains("co 0 so chan, 3 so le"));
        assertTrue(result.contains("TRUNG BINH THAP"));
    }

    @Test
    void path_nonEmpty_mixedParity_boundaryAverageTen_returnsHighAverage() {
        int[] input = { 8, 9, 13 };

        String result = NumberAnalyzer.analyzeNumbers(input);

        assertTrue(result.contains("co 1 so chan, 2 so le"));
        assertTrue(result.contains("TRUNG BINH CAO"));
    }
}
