package com.java.home.java_8.stream.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbers
{
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,4,2,3,6,2,3,4,2,3,8,9);
        Set<Integer> set=new HashSet<Integer>();
        list.stream().filter(i-> !set.add(i))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
