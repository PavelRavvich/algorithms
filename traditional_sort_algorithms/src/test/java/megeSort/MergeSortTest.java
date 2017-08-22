package megeSort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {

        int[] src = {3, 1, 4, 2, 5};

        final int[] result = new MergeSort().sortMerge(src);

        assertThat(result, is(new int[]{1,2,3,4,5}));
    }
}