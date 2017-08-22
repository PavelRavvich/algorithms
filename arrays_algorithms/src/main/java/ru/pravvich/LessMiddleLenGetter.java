package ru.pravvich;

import java.util.ArrayList;
import java.util.List;

/**
 * Task: find all Strings in arr which have length less middle len.
 * Output their with length.
 */
public class LessMiddleLenGetter {

    public List<String> getLessMiddle(String[] src) {
        final List<String> result = new ArrayList<>();

        int common = 0;

        for (String s : src) {
            common += s.length();
        }

        final int middle = common / src.length;


        for (String s : src) {
            if (s.length() < middle) {
                result.add(s);
            }
        }

        return result;
    }
}
