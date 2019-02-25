package com.company;

import java.util.HashSet;
import java.util.Set;

public class Notifier {
    private Set<Student> set = new HashSet<>();

    public Notifier(){}

    public void addStudent(Student student){
        this.set.add(student);
    }
    public void addStudents(Set<Student> set){
        for(Student student : set)
            this.set.add(student);
    }

    public void addStudnets(Set<Postgraduate> set){
        for(Postgraduate student : set)
            this.set.add(student);
    }

    public void display(){
        for(Student i : set){
            System.out.println(i.toString());
        }
    }
    public void doNotifyAll(){
        for(Student i : set)
            System.out.println(i.toString());
    }

    public Notifier(Set<Student> set){
        this.set = set;
    }
}
