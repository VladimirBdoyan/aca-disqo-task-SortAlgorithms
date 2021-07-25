package com.company;

import com.company.com.comparableClasses.Students;
import com.company.util.Sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 25.07.2021.
 * Time: 14:32.
 */
public class Demo {
    public static void main(String[] args) {

        Students s1 = new Students("Grish", Students.Gender.MALE, 17);
        Students s2 = new Students("Ruben", Students.Gender.MALE, 15);
        Students s3 = new Students("Suren", Students.Gender.MALE, 16);
        Students s4 = new Students("Ani", Students.Gender.FEMALE, 14);
        Students s5 = new Students("Lika", Students.Gender.FEMALE, 18);

        List<Students> studentsList1 = new ArrayList<>();

        studentsList1.add(s1);
        studentsList1.add(s2);
        studentsList1.add(s3);
        studentsList1.add(s4);
        studentsList1.add(s5);
        System.out.println("Unsorted Student List");
        System.out.println(studentsList1);
        System.out.println("Sorted Student List by insertionSort");
        Sorting.insertionSort(studentsList1);
        for (Students l : studentsList1) {
            System.out.println(l);
        }

        List<Students> studentsList2 = new ArrayList<>();
        studentsList2.add(s1);
        studentsList2.add(s2);
        studentsList2.add(s3);
        studentsList2.add(s4);
        studentsList2.add(s5);
        System.out.println();
        System.out.println("Unsorted Student List");
        System.out.println(studentsList2);
        System.out.println("Sorted Student List by Quicksort");
        Sorting.quickSort(studentsList2,0, studentsList2.size()-1);
//        System.out.println(studentsList2);

        for (Students l : studentsList2) {
            System.out.println(l);
        }
    }
}
