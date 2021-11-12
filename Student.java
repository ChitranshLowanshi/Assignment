package com.technoelevate.advancedjava.mapassignment;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    Integer marks;
 
    Student(Integer marks) { this.marks = marks; }
 
    
    public String toString() { return (" " + this.marks); }
 
   
    public int compareTo(Student stu)
    {
        return this.marks.compareTo(stu.marks);
    }
}
 
class GFG {
    public static void main(String[] args)
    {
 
        
        LinkedHashSet<Student> set = new LinkedHashSet<>();
 
        
        set.add(new Student(500));
        set.add(new Student(300));
        set.add(new Student(400));
        set.add(new Student(100));
        set.add(new Student(200));
 
        
        System.out.println(
            "Before sort elements in ascending order : "
            + set);
 
        
        TreeSet<Student> tree_set = new TreeSet<>(set);
 
        
        System.out.println(
            "After sort elements in ascending order : "
            + tree_set);
    }
}