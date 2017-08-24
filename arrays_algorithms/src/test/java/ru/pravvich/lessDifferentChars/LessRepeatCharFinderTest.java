package ru.pravvich.lessDifferentChars;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LessRepeatCharFinderTest {

    @Test
    public void lessAmountDifferentCharTest() {
        String[] src = {"aaaa", "aaa","asdf", "aa", "aaaaaa"};

        final String result = new LessRepeatCharFinder()
                .getLessRepeatChars(src);

        assertThat(result, is("asdf"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenSrcIsEmptyThenThrowException() {
        new LessRepeatCharFinder().getLessRepeatChars(new String[]{});
    }
}