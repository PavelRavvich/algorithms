package ru.pravvich.heapSort;

/**
 * Class HeapSort to Implement Heap Sort.
 */
public class HeapSort {
    /**
     * Amount of elements in arr.
     */
    private int n;

    /**
     * Base sort method.
     *
     * @param arr for sorting.
     */
    public void sort(int arr[]) {
        heapify(arr);
        for (int i = n; i > 0; i--) {
            swap(arr, 0, i);
            n = n - 1;
            maxheap(arr, 0);
        }
    }

    /**
     * Create heap.
     */
    private void heapify(int arr[]) {

        n = arr.length - 1;

        for (int i = n / 2; i >= 0; i--) {
            maxheap(arr, i);
        }
    }

    /* Function to swap largest element in heap */

    /**
     * Swap largest element of heap.
     */
    private void maxheap(int arr[], int i) {

        int left = 2 * i;
        int right = 2 * i + 1;

        int max = i;

        if (left <= n && arr[left] > arr[i]) max = left;

        if (right <= n && arr[right] > arr[max]) max = right;

        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }

    /**
     * Swap of two elements in arr.
     *
     * @param arr for swap.
     * @param i element for swap.
     * @param j element for swap.
     */
    private void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
