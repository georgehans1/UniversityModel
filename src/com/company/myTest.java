package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class myTest {
  @Test
  public void getStudentsByNameTest(){
    Student student1 = new Student("George",3737373,Year.FIRST, List.of(83.0,47.4,74.0));
    Student student5 = new Student("Kwesi",38357373,Year.FIRST,List.of(83.0,47.4,74.0));
    Student student2 = new Student("Hanson",4474473,Year.THIRD,List.of(63.0,57.4,94.0));
    Student student3 = new Student("Kwame",1737373,Year.SECOND,List.of(73.0,47.4,54.0));
    Student student4 = new Student("Kofi",2737373,Year.FOURTH,List.of(53.0,47.4,64.0));


    List<Student> students = List.of(student1,student2,student3,student4,student5);
    Register register = new Register(students);
    assertEquals(94.0,register.getHighestGrade(),0.0);

  }

}
