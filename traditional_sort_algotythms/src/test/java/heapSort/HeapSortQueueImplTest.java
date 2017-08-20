package heapSort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HeapSortQueueImplTest {

    @Test
    public void heapSortTest() {

        String[] arr = {"123", "1", "12"};

        new HeapSortQueueImpl().heapsort(arr);

        assertThat(arr, is(new String[]{"1", "12", "123"}));
    }
}