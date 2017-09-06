package ru.pravvich.countAmountRepeateWord;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AmountRepeatFinderTest {

    private final AmountRepeatFinder finder = new AmountRepeatFinder();

    @Test
    public void whenTextAndTargetInThenReturnAmountTargetInTextIterateApproach() {
        final int result = finder
                .getAmountIterate("Hello world, world world.", "world");

        assertThat(result, is(3));
    }

    @Test
    public void whenTextAndTargetInThenReturnAmountTargetInTextStreamApproach() {
        final int result = finder
                .getAmountStream("Hello world, world world.", "world");

        assertThat(result, is(3));
    }

}