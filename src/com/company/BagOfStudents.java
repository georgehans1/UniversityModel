package com.company;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
 List<Student> students = new ArrayList<>();

 public void add(Student student){
     students.add(student);
 }
 public void remove(Student student){
     students.remove(student);
 }

 public void clearAll(){
     students.clear();
 }
}
