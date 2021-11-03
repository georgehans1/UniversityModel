package com.company;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    List<Student> register;

    public Register(List<Student> register) {
        this.register = register;
    }

//    public List<String> getRegister(){
//        List<String> studentNames = new ArrayList<>();
//        for(Student s : names ){
//            studentNames.add(s.getName());
//        }
//        return studentNames;
//    }

//    public List<String> getRegisterByLevel(Year year){
//        List<String> studentNames = new ArrayList<>();
//        for(Student s : names){
//            if(year == s.getLevel()){
//               studentNames.add(s.getName());
//            }
//        }
//        return studentNames;
//    }

    public List<String> getRegister(){
        List<String> studentNames = register.stream().
                map(Student::getName).
                collect(Collectors.toList());
        return studentNames;
    }
    public List<String> getRegisterByLevel(Year year){
        List<String> studentNames = register.stream().
                filter(x->x.getLevel() == year).
                map(Student::getName).
                collect(Collectors.toList());
        return studentNames;
    }

    public String printReport() {
//        for (Student s : register) {
//            if (s.getLevel() == Year.FIRST) {
//                System.out.println("Level: " + Year.FIRST + " " + s.getName());
//            }
//            if (s.getLevel() == Year.SECOND) {
//                System.out.println("Level: " + Year.SECOND + "  "+ s.getName());
//            }
//            if (s.getLevel() == Year.THIRD) {
//                System.out.println("Level: " + Year.THIRD + " " + s.getName());
//            }
//            if (s.getLevel() == Year.FOURTH) {
//                System.out.println("Level: " + Year.FOURTH + " " + s.getName());
//            }
//        }
        register.stream().forEach(c -> System.out.println(c));
        return "Report";
    }
    public Double getHighestGrade(){
       return register.stream()
               .map(x->x.getGrades().mapToDouble(s->s).max())
               .mapToDouble(x->x.getAsDouble())
               .max()
               .getAsDouble();
    }

    public Double getAverageGrade(){
        return register.stream()
                .map(x->x.getGrades().mapToDouble(s->s).average())
                .mapToDouble(x->x.getAsDouble())
                .average()
                .getAsDouble();
    }


    public  List<Double> getGradesAbove(){
        return register.stream()
                .flatMap(x->x.getGrades())
                .filter(x -> x > 60)
                .collect(Collectors.toList());
    }


    public Optional<Student> getStudentByName(String name){
      Optional<Student> studentName = register.stream().
             filter(x->x.getName() == name).
             findAny();
      return studentName;
    }


    public List<Student> getStudentsByName(List<String> names){
      List<Student> students = register.stream()
               .filter(x-> names.contains(x.getName()))
               .collect(Collectors.toList());
       return students;

//        return register.stream().filter(student -> names.contains(student.getName())).collect(Collectors.toList());
    }

}
