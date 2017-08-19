package ru.pravvich.findLargeStringInArr;

/**
 * Tsk: find largest length in string array.
 * Solution: {@link LargeStringFinder#findLargest(String[])}.
 */
public class LargeStringFinder {

    /**
     * Find largest length String in arr.
     *
     * @param src for analysis.
     * @return String with largest length.
     */
    public String findLargest(String[] src) {

        if (src.length == 0) throw new IllegalArgumentException("Arr is empty");

        if (src.length == 1) return src[0];


        int currentLength = src[0].length();

        int index = 0;

        for (int i = 1; i != src.length; i++) {

            if (src[i].length() > currentLength) {

                index = i;

                currentLength = src[i].length();

            }
        }

        return src[index];
    }

}
