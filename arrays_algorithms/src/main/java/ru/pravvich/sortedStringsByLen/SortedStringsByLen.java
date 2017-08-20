package ru.pravvich.sortedStringsByLen;

public class SortedStringsByLen {

    public String[] sortByLengthBubble(String[] arr) {

        for (int i = arr.length; i != -1; i--) {

            for (int j = 0; j != i && j + 1 != arr.length ; j++) {

                if (arr[j].length() > arr[j + 1].length()) {

                    String tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }

        return arr;
    }
}
