package heapSort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HeapSortClassicImplTest {

    @Test
    public void heapSortTest() {

        int[] arr = {123, 1, 12};

        new HeapSortClassicImpl().heapSort(arr);

        assertThat(arr, is(new int[]{1, 12, 123}));
    }
}