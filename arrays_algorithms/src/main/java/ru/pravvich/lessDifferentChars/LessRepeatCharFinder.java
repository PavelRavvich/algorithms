package ru.pravvich.lessDifferentChars;

import com.sun.istack.internal.NotNull;

import java.util.*;

/**
 * We have String[] arr. Find word with contain less different char.
 *
 * Like: ["abca", "abcdef"] answer "abca".
 */
public class LessRepeatCharFinder {

    public String getLessRepeatChars(@NotNull final String[] src) {

        if (src.length == 0) throw new IllegalArgumentException();

        String result = src[0];

        int tmp = getAmountRepeatCharsIn(src[0]);

        for (int i = 1; i < src.length; i++) {

            final int amount = getAmountRepeatCharsIn(src[i]);

            if (tmp > amount) {

                tmp = amount;

                result = src[i];
            }
        }

        return result;
    }

    private int getAmountRepeatCharsIn(@NotNull final String s) {

        final Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {

            Integer amount = map.get(c);

            if (amount == null) {
                map.put(c, 1);
            } else {
                map.replace(c, ++amount);
            }
        }

        int result = 0;

        for (Integer val : map.values()) {

            if (val > result) result = val;
        }

        return result;
    }

 }
