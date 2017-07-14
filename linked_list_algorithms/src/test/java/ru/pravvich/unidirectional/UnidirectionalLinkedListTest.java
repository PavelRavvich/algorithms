package ru.pravvich.unidirectional;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class UnidirectionalLinkedListTest {
    @Test
    public void whenElementFromEndThenReturnValueByIndexFromEnd() {
        UnidirectionalLinkedList<String> u = new UnidirectionalLinkedList<>();
        u.add("3");
        u.add("2");
        u.add("1");
        u.add("0");

        final String result = u.getElementFromEnd(2);

        Assert.assertThat(result, is("2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenIndexNotExistThenThrowException() {
        UnidirectionalLinkedList<String> u = new UnidirectionalLinkedList<>();
        u.add("3");

        u.getElementFromEnd(2);
    }
}