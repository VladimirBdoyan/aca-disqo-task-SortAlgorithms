package com.company.model;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 25.07.2021.
 * Time: 14:33.
 */
public class Student implements Comparable<Student> {
    private int mark;
    private Gender gender;
    private String name;



    public Student(String name, Gender gender, int mark) {
        this.name = name;
        this.gender = gender;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        if (mark > o.mark) {
            return 1;
        } else if (mark < o.mark) {
            return -1;
        }
        return 0;
    }
    public int compareToGender(Student o) {
        if (o.gender.code == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name= '" + name + '\'' +
                ", mark= " + mark + '\'' +
                ", gender= " + gender +
                '}';
    }

    public enum Gender {
        MALE(1),
        FEMALE(2);
        private int code;
        Gender(int code) {
            this.code = code;
        }
    }


}
