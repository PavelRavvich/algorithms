package ru.pravvich.heapSort;

/**
 * Author : Pavel Ravvich.
 * Created : 19.07.17.
 * <p>
 * LessValueFinder
 */
public class LessValueFinder {

    public int[] getLessValues(int amount, int[] arr) {
        new HeapSort().sort(arr);

        final int[] result = new int[amount];
        System.arraycopy(arr, 0, result, 0, amount);

        return result;
    }
}
