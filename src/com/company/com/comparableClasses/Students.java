package com.company.com.comparableClasses;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 25.07.2021.
 * Time: 14:33.
 */
public class Students implements Comparable<Students> {
    private Gender gender;
    private String Name;

    private int mark;

    public Students(String name, Gender gender, int mark) {
        Name = name;
        this.gender = gender;
        this.mark = mark;
    }

    @Override
    public int compareTo(Students o) {
        if (mark > o.mark) {
            return 1;
        } else if (mark < o.mark) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name= '" + Name + '\'' +
                ", mark= " + mark + '\'' +
                ", gender= " + gender +
                '}';
    }

    public enum Gender {
        MALE,
        FEMALE
    }
}
