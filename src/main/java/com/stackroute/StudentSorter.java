package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        if(student.getAge() != t1.getAge())
            return (int) (t1.getAge() - student.getAge());
        else if(!student.getName().equals(t1.getName()))
            return (int) (student.getName().compareTo(t1.getName()));

        return (int) student.getId()-t1.getId();
    }
}
