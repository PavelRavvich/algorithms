package ru.pravvich.sortedStringsByLen;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortedStringsByLenTest {

    @Test
    public void whenSortingThenArrSortByStrLen() {
        final String[] result = new SortedStringsByLen()
                .sortByLengthBubble(new String[]{"12", "123", "1"});

        assertThat(result, is(new String[]{"1", "12", "123"}));
    }

}