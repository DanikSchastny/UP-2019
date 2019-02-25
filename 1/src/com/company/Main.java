package com.company;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Academic academic = new Academic();
        academic.setName("Jenkins");
        Academic academic1 = new Academic();
        academic1.setName("Leroy");

        Undergraduate[] undergraduates = new Undergraduate[2];
        undergraduates[0] = new Undergraduate("Jake", "111@gmail.com", "111", academic);
        undergraduates[1] = new Undergraduate("Kate", "222@gmail.com", "222", academic1);

        Postgraduate[] postgraduates = new Postgraduate[3];
        postgraduates[0] = new Postgraduate("Drake", "333@gmail.com", "333", academic);
        postgraduates[1] = new Postgraduate("Sam", "444@gmail.com", "444", academic);
        postgraduates[2] = new Postgraduate("Paul", "555@gmail.com", "555", academic);

        Set<Student> set = new HashSet<>();
        Arrays.stream(undergraduates).forEach(set::add);
        Arrays.stream(postgraduates).forEach(set::add);

        Course course = new Course("Course 1", set);
        Scanner scanner = new Scanner(System.in);
        Set<Postgraduate> graduates = new HashSet<>(course.getPostgraduates(scanner.nextLine()));
        scanner.close();

        Notifier notifier = new Notifier();

        for(Postgraduate postgraduate : graduates){
            notifier.addStudent(postgraduate);
        }
        notifier.doNotifyAll();
    }
}
