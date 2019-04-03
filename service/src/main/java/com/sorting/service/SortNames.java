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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter comma seperated string Of items to be sorted");
        String itemString = scan.nextLine();



        String newItemString = itemString.replace("\"", "");
        newItemString = newItemString.replaceAll("\\d", "");
        newItemString = newItemString.replaceAll("[^a-zA-Z0-9,]", "");
        List<String> nameList = Stream.of(newItemString.split(",")).collect(Collectors.toList());
        Sort sort = new Sort();
        sort.sortNames(nameList);
        Iterator<String> it = nameList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }

}
