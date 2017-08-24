package ru.pravvich.lessDifferentChars;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LessDifferentCharFinderTest {

    @Test
    public void lessAmountDifferentCharTest() {
        String[] src = {"aaaa", "aaa","asdf", "aa", "aaaaaa"};

        final String result = new LessDifferentCharFinder()
                .getLessDifferentChars(src);

        assertThat(result, is("asdf"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSrcIsEmptyThenThrowException() {
        new LessDifferentCharFinder().getLessDifferentChars(new String[]{});
    }
}