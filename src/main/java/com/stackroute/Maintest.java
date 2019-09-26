package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maintest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2,"Srikanth",23));
        list.add(new Student(1,"Nandikonda",24));
        list.add(new Student(3,"Srikanth",23));
        Collections.sort(list,new StudentSorter());
        System.out.println(list.toString());
    }
}
