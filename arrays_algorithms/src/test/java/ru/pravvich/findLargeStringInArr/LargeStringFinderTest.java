package ru.pravvich.findLargeStringInArr;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LargeStringFinderTest {

    private final LargeStringFinder finder = new LargeStringFinder();

    @Test(expected = IllegalArgumentException.class)
    public void whenArrIsEmptyThenThrowException() {
        finder.findLargest(new String[]{});
    }

    @Test
    public void whenArrContainOneElementThenReturnItElem() {
        final String result = finder.findLargest(new String[]{"java"});
        assertThat(result, is("java"));
    }

    @Test
    public void whenArrContainTreeDifferentElemThenReturnLargest() {
        final String res = finder.findLargest(new String[]{"a", "abc", "ab"});
        assertThat(res, is("abc"));
    }
}