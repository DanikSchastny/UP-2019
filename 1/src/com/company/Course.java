package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Course {
    private Set<Student> students = new HashSet<>();
    private String name;

    public Course(String name, Set<Student> students){
        this.name = name;
        this.students = students;
    }


    public Set<Postgraduate> getPostgraduates(String supervisorName){
        String str = "class com.company.Postgraduate";
        Set<Postgraduate> set = new HashSet<>();
        for(Student student : students) {

            if (student.getClass().toString().equals(str)) {
                if (((Postgraduate) student).getSupervisor().getName().equals(supervisorName)) {
                    set.add((Postgraduate) student);
                }
            }
        }
        return set;
    }

}
