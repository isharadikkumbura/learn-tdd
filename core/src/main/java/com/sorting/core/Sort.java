package com.sorting.core;

import java.util.Arrays;
import java.util.List;

public class Sort {
    public List<String> sortNames(List<String> nameList) {


        String[] listString = nameList.toArray(new String[0]);

        String sortedString = sortString(listString);
        sortedString = sortedString.replaceAll("\\[", "").replaceAll("\\]", "");
        List<String> items = Arrays.asList(sortedString.split("\\s*,\\s*"));

        //Collections.sort(nameList);
        return items;
    }

    // Method to sort a mixed string
    public static String sortString(String[] myArray) {
        int size = myArray.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    String temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return Arrays.toString(myArray);
    }
}

