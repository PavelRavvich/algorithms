package ru.pravvich.countAmountRepeateWord;

import java.util.Arrays;
import java.util.Map;

/**
 * Task: find amount repeat like:
 * "Hello world, world world". For "world" result = 3.
 */
public class AmountRepeatFinder {

    public int getAmountStream(final String src, final String target) {

        final String data = src.replaceAll("\\,|\\.", "");

        return (int)Arrays
                .stream(data.split("\\s+"))
                .filter(target::equals)
                .count();
    }

    public int getAmountIterate(final String src, final String target) {

        final String data = src.replaceAll("\\,|\\.", " ");

        final String[] arrSrc = data.split(" ");

        int result = 0;

        for (String s : arrSrc) {
            if (target.equals(s)) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new AmountRepeatFinder().getAmountIterate("Hello world, world world.","world"));
    }
}
