package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodeSnippet {
    public static void main(String[] args) {
        List<String> stringList  = Arrays.asList("ab","cd").stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println("stringList:{}"+stringList);
    }
//    Arrays.asList(“ab”, “cd”).stream().filter(e => e.startsWith("a")).toList();
}
