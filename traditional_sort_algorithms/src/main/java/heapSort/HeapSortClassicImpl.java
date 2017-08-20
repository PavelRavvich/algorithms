package heapSort;

/**
 * Classic impl heap sort.
 */
public class HeapSortClassicImpl {

    public void heapSort(int[] arr) {
        int count = arr.length;

        //first place a in max-heap order
        heapify(arr, count);

        int end = count - 1;
        while (end > 0) {
            //swap the root(maximum value) of the heap with the
            //last element of the heap
            int tmp = arr[end];
            arr[end] = arr[0];
            arr[0] = tmp;
            //put the heap back in max-heap order
            siftDown(arr, 0, end - 1);
            //decrement the size of the heap so that the previous
            //max value will stay in its proper place
            end--;
        }
    }

    private void heapify(int[] arr, int count) {
        //start is assigned the index in a of the last parent node
        int start = (count - 2) / 2; //binary heap

        while (start >= 0) {
            //sift down the node at index start to the proper place
            //such that all nodes below the start index are in heap
            //order
            siftDown(arr, start, count - 1);
            start--;
        }
        //after sifting down the root all nodes/elements are in heap order
    }

    private void siftDown(int[] arr, int start, int end) {
        //end represents the limit of how far down the heap to sift
        int root = start;

        while ((root * 2 + 1) <= end) {      //While the root has at least one child
            int child = root * 2 + 1;           //root*2+1 points to the left child
            //if the child has a sibling and the child's value is less than its sibling's...
            if (child + 1 <= end && arr[child] < arr[child + 1])
                child = child + 1;           //... then point to the right child instead
            if (arr[root] < arr[child]) {     //out of max-heap order
                int tmp = arr[root];
                arr[root] = arr[child];
                arr[child] = tmp;
                root = child;                //repeat to continue sifting down the child now
            } else {
                return;
            }
        }
    }
}
