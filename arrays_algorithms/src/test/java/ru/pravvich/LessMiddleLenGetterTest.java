package ru.pravvich;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LessMiddleLenGetterTest {

    @Test
    public void testGetLessMiddle() {

        final String[] src = {"12", "1", "123", "1234", "12345"};

        final List<String> result = new LessMiddleLenGetter().getLessMiddle(src);

        final List<String> expected = new ArrayList<>();
        expected.add("12");
        expected.add("1");

        assertThat(result, is(expected));
    }
}