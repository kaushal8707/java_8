package com.java.home.java_8.stream.programs;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//average score of all students.....

public class AvgScoreOfStudent
{
    public static void main(String[] args)
    {
        List<Student> list = Arrays.asList(new Student(1,"abc",15),
                new Student(2,"def",20),
                new Student(3,"jkl",25),
                new Student(4,"xyz",30));

        double avg=list.stream().collect(Collectors.summarizingInt(Student-> Student.getId()))
                .getAverage();
        System.out.println(avg);

        double avg2=list.stream().collect(Collectors.summarizingInt(Student::getId))
                .getAverage();
        System.out.println(avg2);

    }
}
