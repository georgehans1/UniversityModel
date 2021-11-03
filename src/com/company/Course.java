package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students = new ArrayList<>();
    private Courses course;

    public Course(Lecturer lecturer,Courses course) {
        this.lecturer = lecturer;
        this.course = course;
    }



//    public void addStudent(Student student){
//     this.students.add(student);
//    }

    @Override
    public String toString() {
        return course +" " + "Course{" + "\n"+
                "Lecturer: " + lecturer + "\n"+
//                " Students: " + students + "\n"+
                '}';
    }
}
