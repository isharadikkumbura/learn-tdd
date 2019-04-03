package com.sorting.service;

import com.sorting.core.Sort;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class SortNamesTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @DisplayName("Test the algorithm")
    @Test
    void testSortingAlgirithm() {
        Sort sort = new Sort();

        List<String> nameList = new ArrayList<>();
        nameList.add("Ishara");
        nameList.add("Chathurika");
        nameList.add("Ann");

        List<String> actual = sort.sortNames(nameList);

        List<String> expected = new ArrayList<>();
        expected.add("Ann");
        expected.add("Chathurika");
        expected.add("Ishara");

        Assert.assertEquals(expected, actual);
    }

    @DisplayName("Input with numbers")
    @Test
    void testCleanString() throws IOException {

        String input = "";
        String expected = "empty";
        Assert.assertEquals(expected, SortNames.checkInput(input));
    }

    @DisplayName("Input with numbers")
    @Test
    void testNumbers() throws IOException {

        String input = "23244";
        String expected = "error";
        Assert.assertEquals(expected, SortNames.checkInput(input));
    }

    @DisplayName("Clean the input")
    @Test
    void testSortWithLetters() throws IOException {

        String input = "23244\"Ishara\" Chathurika 9 Ann";
        String expected = "IsharaChathurikaAnn";
        Assert.assertEquals(expected, SortNames.cleanString(input));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}