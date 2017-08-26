package ru.pravvich.deleteElement;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LinkedSimpleDeleteTest {

    private final LinkedSimpleDelete<Integer> list = new LinkedSimpleDelete<>();

    @Test
    public void deleteFirstElemFrom2Elem() {
        list.add(1);
        list.add(2);

        list.delete(0);

        final Iterator<Integer> iterator = list.iterator();

        final Integer second = iterator.next();

        assertThat(second, is(2));
    }

    @Test
    public void deleteLastElemFrom2Elem() {
        list.add(1);
        list.add(2);

        list.delete(1);

        final Iterator<Integer> iterator = list.iterator();

        final Integer first = iterator.next();

        assertThat(first, is(1));
    }

    @Test
    public void deleteSecondElemFrom3Elem() {
        list.add(1);
        list.add(2);
        list.add(3);

        list.delete(1);

        final Iterator<Integer> iterator = list.iterator();

        final Integer first = iterator.next();
        final Integer second = iterator.next();

        assertThat(first, is(1));
        assertThat(second, is(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexLessZero() {
        list.delete(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexEqualSizeValue() {
        list.delete(1);
    }
}