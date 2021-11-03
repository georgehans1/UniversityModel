package com.company;

public class Lecturer {
    private String name;
    private int lecturerID;
    private Courses courses;

    public Lecturer(String name, int lecturerID, Courses courses) {
        this.name = name;
        this.lecturerID = lecturerID;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return
                " Lecturer name: " + name  +
                ", lecturerID: " + lecturerID +
                ", courses: " + courses +
                '}';
    }
}
