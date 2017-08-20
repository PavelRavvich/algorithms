package heapSort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {

    public <E extends Comparable<? super E>> void heapsort(E[] array) {

        // Java's PriorityQueue class functions as a min heap.
        PriorityQueue<E> heap = new PriorityQueue<E>(array.length);

        // Add each array element to the heap.
        heap.addAll(Arrays.asList(array));

        // Elements come off the heap in ascending order
        for (int i=array.length - 1; i != -1; i--)
            array[i] = heap.remove();

    }

    public static void main(String[] args) {
        final String[] strings = {"sdd", "assdd", "w", "ss"};
        new HeapSort().heapsort(strings);
        for (String s:strings) System.out.println(s);
    }
}
