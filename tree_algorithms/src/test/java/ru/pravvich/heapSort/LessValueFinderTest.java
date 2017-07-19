package ru.pravvich.heapSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class LessValueFinderTest {

    @Test
    public void whenNotSortArrInThenNAmountLessElementOut() {
        int[] data = {6, 1, 9, 2, 8, 3, 7, 3, 5, 4};
        int n = 3;

        final int[] result = new LessValueFinder().getLessValues(n, data);

        int[] expected = {1, 2, 3};

        assertArrayEquals(result, expected);
    }
}