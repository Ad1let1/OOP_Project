package university.models.users;

import university.models.academic.Course;

import java.util.*;


public class Student extends User {
    public double gpa;
    public int credits;
    public Set<Course> courses = new HashSet<>();
    public List<Double> marks = new ArrayList<>();

    public Student(){

    }

    public void addMark(double mark){
        marks.add(mark);
    }
}