package com.sorting.service;

import com.sorting.core.Sort;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sun.applet.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        List<String> expected =new ArrayList<>();
        expected.add("Ann");
        expected.add("Chathurika");
        expected.add("Ishara");

        Assert.assertEquals(expected,actual );
    }


    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}