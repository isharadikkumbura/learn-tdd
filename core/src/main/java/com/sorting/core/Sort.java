package com.sorting.core;

import java.util.Collections;
import java.util.List;

public class Sort {
    public List<String> sortNames(List<String> nameList) {
        Collections.sort(nameList);
        return nameList;
    }
}

