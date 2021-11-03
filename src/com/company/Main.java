package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	Student student1 = new Student("George",3737373,Year.FIRST,List.of(83.0,47.4,74.0));

    Student student2 = new Student("Hanson",4474473,Year.THIRD,List.of(63.0,57.4,94.0));
    Student student3 = new Student("Kwame",1737373,Year.SECOND,List.of(73.0,47.4,54.0));
    Student student4 = new Student("Kofi",2737373,Year.FOURTH,List.of(53.0,47.4,64.0));
        Student student5 = new Student("Kwesi",38357373,Year.FIRST,List.of(83.0,47.4,74.0));


    List<Student> students = List.of(student1,student2,student3,student4,student5);



    Lecturer Sam = new Lecturer("Sam",900000,Courses.PROGRAMMING);
    Lecturer Marv = new Lecturer("Marv",400000,Courses.GARDENING);
    Lecturer Jamie = new Lecturer("Jamie",300000,Courses.PHYSICS);

    Course Programming = new Course(Sam,Courses.PROGRAMMING);

    Course Gardening = new Course(Marv,Courses.GARDENING);
    System.out.println(Programming);
    Course Physics = new Course(Jamie,Courses.PHYSICS);
    System.out.println(Physics);

        System.out.println(student1.getAverageGrade());

        Lecture MathLecture = new Lecture();
        MathLecture.Enter(student1);
        MathLecture.Enter(student2);
        System.out.println(MathLecture.getHighestAverageGrade());




        NaughtyStudent naughty1 = new NaughtyStudent("Benjamin",4594473,Year.THIRD,List.of(70.0,70.0,70.0));
        System.out.println(naughty1.getAverageGrade());

        MathLecture.Enter(naughty1);
        System.out.println(MathLecture);

        Bag bag = new Bag();
        bag.add(student1);
        bag.add(Sam);
        bag.add(Marv);
        System.out.println(bag);

        Bag<Student> studentBag = new Bag<>();
        studentBag.add(student1);
        System.out.println(studentBag);

        Bag<Lecturer> lecturerBag = new Bag<>();
        lecturerBag.add(Sam);
        System.out.println(lecturerBag);

        Register register = new Register(students);
        System.out.println(register.getRegister());
        System.out.println(register.getRegisterByLevel(Year.FIRST));
        System.out.println(register.getHighestGrade());
        System.out.println(register.getAverageGrade());
        System.out.println(register.getGradesAbove());


        List<Student> firstYearStudents = students.stream().filter(x->x.getLevel() == Year.FIRST).collect(Collectors.toList());
//        List<Student> studentList = students.stream().sorted(x-> x.getLevel())
        ;
        System.out.println(firstYearStudents);

        System.out.println(register.getStudentByName("Hans"));

//        System.out.println(register.getStudentsByName(List.of("Kwesi","Hanson")));
        System.out.println(register.printReport());

    }


}
