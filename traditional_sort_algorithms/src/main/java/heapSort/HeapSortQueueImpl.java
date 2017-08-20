package heapSort;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Impl Heap Sort thought Queue using comparator.
 */
public class HeapSortQueueImpl {

    public <E extends Comparable<? super E>> void heapsort(E[] array) {

        // Java's PriorityQueue class functions as a min heap.
        PriorityQueue<E> heap = new PriorityQueue<E>(array.length);

        // Add each array element to the heap.
        heap.addAll(Arrays.asList(array));

        // Elements come off the heap in ascending order
        for (int i=0; i<array.length; i++) {
            array[i] = heap.remove();
        }

    }
}
