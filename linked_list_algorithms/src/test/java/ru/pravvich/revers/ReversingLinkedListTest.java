package ru.pravvich.revers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReversingLinkedListTest {

    @Test
    public void reverseWithFiveElemsTest() {
        final ReversingLinkedList<Integer> result =
                new ReversingLinkedList<>(5, 4, 3, 2, 1).reverse();

        assertThat(result.toString(), is("[1 2 3 4 5 ]"));
    }

    @Test
    public void reversWithEmptyList() {
        final ReversingLinkedList<Integer> result =
                new ReversingLinkedList<Integer>().reverse();

        assertThat(result.toString(), is("[]"));
    }

    @Test
    public void reversWithOneElements() {
        final ReversingLinkedList<Integer> result =
                new ReversingLinkedList<>(1).reverse();

        assertThat(result.toString(), is("[1 ]"));
    }

    @Test
    public void reversWithTwoElems() {
        final ReversingLinkedList<Integer> result =
                new ReversingLinkedList<>(1, 2).reverse();

        assertThat(result.toString(), is("[2 1 ]"));
    }
}