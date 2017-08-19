package ru.pravvich.reversString;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReversSingleStringTest {

    @Test
    public void whenStringWith4CharsInThenReversedStringOut() {

        final String result = new ReversSingleString("avaj").revers();

        assertThat(result, is("java"));
    }

    @Test
    public void whenStringWith2CharsInThenReversedStringOut() {

        final String result = new ReversSingleString("ab").revers();

        assertThat(result, is("ba"));
    }

    @Test
    public void whenStringWith1CharInThenSameStringOut() {

        final String result = new ReversSingleString("a").revers();

        assertThat(result, is("a"));
    }
}