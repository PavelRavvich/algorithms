package ru.pravvich.findLargeStringInArr;

public class LargeStringFinder {

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

    public static void main(String[] args) {

        String[] arr = {"asd", "sd", "jhjkgh", "h"};

        System.out.println(new LargeStringFinder().findLargest(arr));
    }
}
