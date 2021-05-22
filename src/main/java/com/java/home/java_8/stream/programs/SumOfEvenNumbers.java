package com.java.home.java_8.stream.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SumOfEvenNumbers
{
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<=100;i++)
        {
            list.add(i);
        }
        list.forEach(System.out::println);

        Predicate<Integer> predicate=i->i%2==0;
        //list of even Numbers
        list.stream()
                .filter(predicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //sum of list of even numbers
        long sum_of_even=list.stream().filter(predicate)
                .collect(Collectors.summarizingInt(i->i))
                .getSum();
        System.out.println("Sum Of Even Number : "+sum_of_even);
    }
}
