package ru.pravvich.reversString;

/**
 * Task: revers string like 'abc' -> 'cba'.
 * Solution: {@link ReversSingleString#revers()}.
 */
public class ReversSingleString {
    /**
     * Source string for reversing.
     */
    private String src;

    /**
     * Default constructor.
     *
     * @param src fir reversing.
     */
    public ReversSingleString(String src) {
        this.src = src;
    }

    /**
     * Revers string.
     *
     * @return reverted string.
     */
    public String revers() {

        final char[] arrSrc = src.toCharArray();

        for (int i = 0, j = arrSrc.length - 1; i < arrSrc.length / 2; i++, j--) {

            char tmp = arrSrc[i];

            arrSrc[i] = arrSrc[j];

            arrSrc[j] = tmp;
        }

        return String.valueOf(arrSrc);
    }

}
