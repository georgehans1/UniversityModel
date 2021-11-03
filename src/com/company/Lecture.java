package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    List<Student> students = new ArrayList<>();

//    public Lecture(List<Student> students) {
//        this.students = students;
//    }

    public void Enter(Student student){
        students.add(student);
    }

    public Double getHighestAverageGrade(){
        double max = 0;
        for(Student s: students){
            if(s.getAverageGrade() > max){
                max = s.getAverageGrade();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "students=" + students +
                '}';
    }
}
