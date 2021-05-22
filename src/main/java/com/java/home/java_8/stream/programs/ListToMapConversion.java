package com.java.home.java_8.stream.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion
{
    public static void main(String[] args)
    {
        //convert list to map and sort based on name and score
        List<Student> list = Arrays.asList(new Student(1,"def",21),
                new Student(2,"abc",12),
                new Student(3,"xyz",13),
                new Student(4,"jkl",22));
        Map<String,Integer> map=list.stream()
                .collect(Collectors.toMap(Student::getName,Student::getScore));

        System.out.println("sorting based on score");
        //sorting based on score
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(System.out::println);
        System.out.println("sorting based on Name");
        //sorting based on Name
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(System.out::println);

    }
}
