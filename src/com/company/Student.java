package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Student implements Nameable,HasLevel{
    private String name;
    private int studentID;
    private Year studentYear;
    private List<Double> grades = new ArrayList<>();

    public Student(String name, int studentID, Year studentYear,List<Double> grades) {
        this.name = name;
        this.studentID = studentID;
        this.studentYear = studentYear;
        this.grades = grades;
    }



    public Double getAverageGrade(){
        double total = 0;
        double average = 0;
        for(double g : grades ){
            total = total + g;
            average = total/grades.size();
        }
        return average;
    }

    @Override
    public String toString() {
        return "Student " +
                "name: " + name +
                ", studentID: " + studentID +
                ", studentYear: " + studentYear +
                ", studentGrades: " + grades +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Year getLevel() {
        return studentYear;
    }

    public Stream<Double> getGrades(){
        return grades.stream();
    }

}
