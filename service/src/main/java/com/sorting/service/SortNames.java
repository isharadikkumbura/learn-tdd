package com.sorting.service;

import com.sorting.core.Sort;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortNames {

    public static void main(String args[]) {
        String itemString = getInputs();
        checkInput(itemString);
        String cleanedString =  cleanString(itemString);
        List<String> nameList= Stream.of(cleanedString.split(",")).collect(Collectors.toList());


        Sort sort = new Sort();
        sort.sortNames(nameList);



    }

    public static String getInputs() {
        String itemString = readInput();
        return itemString;
    }

    public static String checkInput(String itemString) {
        if (itemString.isEmpty()) {
            System.out.println("Empty,Try again");
            return "empty";

            //readInput();
        }
        if (StringUtils.isNumeric(itemString)) {
            System.out.println("No Characters in the string, Please Re-Enter");
            return "error";

        }
        return itemString;
    }

    public static String readInput() {
        System.out.println("Enter comma seperated string Of items to be sorted");
        Scanner scan = new Scanner(System.in);
        String itemString = scan.nextLine();
        return itemString;
    }

    public static String cleanString(String itemString) {

        String newItemString = itemString.replaceAll("\\d", "");
        newItemString = newItemString.replaceAll("[^a-zA-Z0-9,]", "");

//        Iterator<String> it = nameList.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        return newItemString;
    }



}
