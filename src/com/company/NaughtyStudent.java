package com.company;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(String name, int studentID, Year studentYear, List<Double> grades) {
        super(name, studentID, studentYear, grades);
    }

    @Override
    public Double getAverageGrade() {
        return super.getAverageGrade() * 0.10 + super.getAverageGrade();
    }


}
